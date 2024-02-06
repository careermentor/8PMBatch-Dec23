package org.xyz.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchDataRuntime 
{
	
	WebDriver driver;
	
	@Test
	public void launchBrowser() throws Exception
	{
		//WebDriverManager.chromedriver().setup();
		
		//Step1
		
		driver= new ChromeDriver(); //2018   //launch the chrome browser
		
		String ExpURL = "https://www.facebook.com/";
		
		driver.get(ExpURL);
		
		String ActURL = driver.getCurrentUrl();
		System.out.println(ActURL);
		
		//Assert.assertEquals(ActURL, ExpURL);    //failed  --hard assertion
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ActURL, ExpURL);  
		
		
		
		System.out.println("this is test case is executed successfully");
		
		String ExpTitle = "Facebook – log in or sign up";
		String ActTitle = driver.getTitle();
		System.out.println(ActTitle);
		
		sa.assertEquals(ActTitle, ExpTitle);
		System.out.println("this test case is execucted successfully");
		
		//Step2
		
		String ExpUsername = "Email address or phone number";
		String ActUsername = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(ActUsername);
		sa.assertEquals(ActUsername, ExpUsername);
		
		String ExpLoginText = "Log in";
		String ActLoginText = driver.findElement(By.name("login")).getText();
		System.out.println(ActLoginText);
		sa.assertEquals(ActLoginText, ExpLoginText);
		
		Point actLoc = driver.findElement(By.name("login")).getLocation();
		System.out.println(actLoc);
		System.out.println(driver.getPageSource());
		
		driver.close();
		
		sa.assertAll();

	}
	
	
			
}
