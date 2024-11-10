package ExtentReportHYRs;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Part3_ExtentReport_Basic {

	public static void main(String[] args) throws IOException {

		ExtentReports extentReorts = new ExtentReports();
		File file = new File("ExtentReportHYR\\BasicExtentReport.html");
		ExtentSparkReporter sparkReports = new ExtentSparkReporter(file);
		extentReorts.attachReporter(sparkReports);
		
		ExtentTest test1 = extentReorts.createTest("Test1");
		test1.pass("This is passed");
		
		ExtentTest test2 = extentReorts.createTest("Test2");
		test1.log(Status.FAIL,"This is Failed");
		
		extentReorts.flush();
		Desktop.getDesktop().browse(new File("ExtentReportHYR\\BasicExtentReport.html").toURI());
	}
}
