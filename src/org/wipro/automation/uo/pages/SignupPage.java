package org.wipro.automation.uo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.uo.utilitiesPkg.UtilitiesClass;

public class SignupPage
{

	WebDriver driver;
	
	public SignupPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	
	public void click_createnewaccountbttn() throws Exception
	{
		driver.findElement(By.xpath(UtilitiesClass.readelement("FB_login_CreateNewAccount_xpath"))).click();
		
	}

	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(UtilitiesClass.readelement("FB_Signup_FirstName_name"))).sendKeys(fname);
		
	}
	}
