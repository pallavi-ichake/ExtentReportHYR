package com.ExtentReports.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderParalla extends BaseTests
{
	//using method in data provider
	@DataProvider(parallel = true)
	public Object[][] DataProviderTest()
	{
		Object[][] fbData = new Object[2][2];
		fbData[0][0] = "Abhijeet";
		fbData[0][1] = "Abhipal";
		fbData[1][0] = "Deshmukha";
		fbData[1][1] = "Ichake";
		return fbData;
	}  
	
	
	@Test(dataProvider = "DataProviderTest")
	public void testDataProvider(String username, String passowrd)
		{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys(username);

		driver.findElement(By.id("pass")).sendKeys(passowrd);
		
		driver.quit();
		}
	
	//using method in data provider
		@DataProvider(name = "dp")
		public Object[][] DataProviderTestwithName()
		{
			Object[][] fbData = new Object[2][2];
			fbData[0][0] = "Abhijeet";
			fbData[0][1] = "Abhipal";
			fbData[1][0] = "Deshmukha";
			fbData[1][1] = "Ichake";
			return fbData;
		}  
		
		
		@Test(dataProvider = "dp")
		public void testDataProviderWithName(String username, String passowrd)
			{
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();

			driver.findElement(By.id("email")).sendKeys(username);

			driver.findElement(By.id("pass")).sendKeys(passowrd);
			
			driver.quit();
			}
	}


