package framework.utils;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
	
	private static ExtentReports extent ;
	
	public static ExtentReports getInstance() {
		
		String reportPath = System.getProperty("user.dir")+"/reports/ExtentReports.html";
		File reportDir =new File(System.getProperty("user.dir")+"/reports");
		if(!reportDir.exists()) {
			reportDir.mkdirs();
		}
		
		if(extent == null) {
			ExtentSparkReporter spark = new ExtentSparkReporter("reports/ExtentReport.html");
			extent = new ExtentReports();
			extent.attachReporter(spark);
		}
		return extent;
	}
}
