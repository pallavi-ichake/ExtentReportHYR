package ExtentReportHYRs;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part6_ExtentReport_Screenshot 
{
	public static void main(String[] args) throws IOException {

		ExtentReports extentReorts = new ExtentReports();
		String filepath = "LogExtentReport.html";
		File file = new File(filepath);
		ExtentSparkReporter sparkReports = new ExtentSparkReporter(file);
		extentReorts.attachReporter(sparkReports);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("Pallavi");
		driver.findElement(By.id("pass")).sendKeys("Abhijeet");	
		//String path = captureScreenshot();
		
		extentReorts.createTest("Test1")
		.info("This is passed");
		
	   /* public static String captureScreenshot() throws IOException
	    {
	        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);
	        String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateName + ".png";
	        File finalDestination = new File(destination);
	        FileUtils.copyFile(source, finalDestination);
	        return destination;
	    }*/
		
		extentReorts.flush();
		Desktop.getDesktop().browse(new File("LogExtentReport.html").toURI());
	}
}



