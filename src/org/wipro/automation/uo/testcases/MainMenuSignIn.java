package org.wipro.automation.uo.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.uo.baseClassPkg.InitiateBrowser;
import org.wipro.automation.uo.pages.UO_MainMenu;

public class MainMenuSignIn extends InitiateBrowser
{

	@Test
	public void validate_mainMenuSign() throws Exception
	{
		UO_MainMenu menu =new UO_MainMenu(driver);
		menu.click_mainmenubttn();
		menu.click_signmenubttn();
		
	}
	
}
