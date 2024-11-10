package ExtentReportHYRs;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Part5_ExtentReport_Formating 
{
	public static void main(String[] args) throws IOException {

		ExtentReports extentReorts = new ExtentReports();
		String filepath = "LogExtentReport.html";
		File file = new File(filepath);
		ExtentSparkReporter sparkReports = new ExtentSparkReporter(file);
		extentReorts.attachReporter(sparkReports);
		
		extentReorts.createTest("Test1")	
		.log(Status.INFO,"info1")
		.log(Status.FAIL,"Fail")
		.log(Status.PASS,"Pass")
		.log(Status.SKIP,"Skip")
		.log(Status.WARNING,"Warning");
		
		extentReorts.flush();
		Desktop.getDesktop().browse(new File("LogExtentReport.html").toURI());
	}
}



