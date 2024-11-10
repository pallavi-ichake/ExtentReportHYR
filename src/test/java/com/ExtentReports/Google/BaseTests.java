package com.ExtentReports.Google;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class BaseTests {
 
    public static WebDriver driver;
    public WebDriverWait wait;
       
    @BeforeTest
    public void setup() throws Exception {
      System.out.println("SetupCompleyte");
    }
       
    @AfterTest
     public  void closeBrowser() {
             
       driver.close();      
               
      }
}