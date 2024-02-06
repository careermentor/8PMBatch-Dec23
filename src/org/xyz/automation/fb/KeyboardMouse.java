package org.xyz.automation.fb;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyboardMouse 
{
	
	WebDriver driver;
	
	@Test(groups="Sanity")
	public void handleFrames() throws Exception
	{
		
		
		//WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(); //2018   //launch the chrome browser
		driver.get("https://demoqa.com/frames");
		
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Sample Iframe')]")).getText());
		
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'This is a sample page')]")).getText());
		
		CaptureScreenshot.screenresult(driver,"handleFrames");
	}
	
	@Test(enabled=true)
	public void handleAlerts() throws Exception
	{
		
		
		//WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(); //2018   //launch the chrome browser
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.className("signinbtn")).click();
		//CaptureScreenshot.screenresult(driver,"handleAlerts_1");
		driver.switchTo().alert().accept();
		
		CaptureScreenshot.screenresult(driver,"handleAlerts_2");
	}
	
	@Test(enabled=false)
	public void handleMouse() throws Exception
	{
		
		
		//WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(); //2018   //launch the chrome browser
		driver.get("https://www.mphasis.com/home.html");
		
		//driver.findElement(By.xpath("//a[text()='Our Approach']")).click();
		
		Actions act = new Actions(driver);
		//act.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		//act.doubleClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		//act.contextClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
		//act.click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality')]"))).perform();
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality')]"))).keyUp(Keys.CONTROL).perform();
		
		Set<String> winsid = driver.getWindowHandles();
		System.out.println(winsid);
		Iterator<String> itr = winsid.iterator();
		String win1 = itr.next();
		String win2 = itr.next();
		
		driver.switchTo().window(win2);
		//driver.switchTo().window(win1);
		
	}	
	
	@Test(enabled=false)
	public void handleKeyboard() throws Exception
	{
		
		
		//WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(); //2018   //launch the chrome browser
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize(); 
		
		Actions act = new Actions(driver);
		
		act.sendKeys("user1").perform();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		act.sendKeys("user3").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("pass1234").perform();
		act.sendKeys(Keys.ENTER).perform();
		
		
	}
		
}
