package org.wipro.automation.uo.utilitiesPkg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot 
{

	
	public static void screenresult(WebDriver driver, String name) throws Exception
	{
		TakesScreenshot prtsc = (TakesScreenshot) driver;
		File f = prtsc.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./TestResult/" + name + ".png");
		
		
		FileUtils.copyFile(f, fd);
	
		
	}
	
	
	
}
