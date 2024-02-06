package org.xyz.automation.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DifferentWBControl 
{
	
	WebDriver driver;
	
	@Test
	public void launchBrowser() throws Exception
	{
		//WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(); //2018   //launch the chrome browser
		driver.navigate().to("https://thetestingworld.com/testings/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		/*
		driver.findElement(By.id("email")).sendKeys("Santosh");
		Thread.sleep(5000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("Amitesh");
		*/
		
		int a = 20;
		
		WebElement x = driver.findElement(By.name("fld_username"));
		
		x.sendKeys("selenium");
		
		driver.findElement(By.cssSelector("[value='home']")).click();
		
		Select gen = new Select(driver.findElement(By.name("sex")));
		
		gen.selectByVisibleText("Male");
		
		//int a = 20;
		
		//WebElement cont = driver.findElement(By.name("country"));
		
		Select con = new Select(driver.findElement(By.name("country")));
		
		con.selectByVisibleText("India");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Goa"));
		
		st.selectByVisibleText("Telangana");
		
		
		System.out.println(driver.findElement(By.name("terms")).isSelected());  //false
		
		driver.findElement(By.name("terms")).click();
		//driver.findElement(By.cssSelector(".displayPopup")).click();
		
		System.out.println(driver.findElement(By.name("terms")).isSelected());  //true
		
	}
			
}
