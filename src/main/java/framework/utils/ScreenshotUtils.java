package framework.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class ScreenshotUtils {
	
	public static void takeScreenshot(WebDriver driver, String testName) {
		
		File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss"));
		File dest = new File(System.getProperty("user.dir")+"/screenshots/"+testName+ "_"+timestamp+".png");
	
		try {
			Files.copy(src.toPath(), dest.toPath());
		} catch (IOException e) {
			e.printStackTrace();
			
		}
	}

}
