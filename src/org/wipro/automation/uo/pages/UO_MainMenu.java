package org.wipro.automation.uo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.uo.utilitiesPkg.UtilitiesClass;

public class UO_MainMenu
{

	WebDriver driver;
	
	public UO_MainMenu(WebDriver driver) 
	{
		this.driver=driver;
	}

	
	public void click_mainmenubttn() throws Exception
	{
		driver.findElement(By.cssSelector(UtilitiesClass.readelement("UO_main_menu_buttn_css"))).click();
		
	}
	
	public void click_signmenubttn() throws Exception
	{
		driver.findElement(By.xpath(UtilitiesClass.readelement("UO_main_menu_sign_buttn_xpath"))).click();
		
	}
}
