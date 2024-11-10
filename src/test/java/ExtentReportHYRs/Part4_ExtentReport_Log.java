package ExtentReportHYRs;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Part4_ExtentReport_Log 
{
	public static void main(String[] args) throws IOException {

		ExtentReports extentReorts = new ExtentReports();
		String filepath = "LogExtentReport.html";
		File file = new File(filepath);
		ExtentSparkReporter sparkReports = new ExtentSparkReporter(file);
		extentReorts.attachReporter(sparkReports);
		
		
		extentReorts.flush();
		Desktop.getDesktop().browse(new File("LogExtentReport.html").toURI());
	}
}



