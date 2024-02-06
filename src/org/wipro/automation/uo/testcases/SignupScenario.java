package org.wipro.automation.uo.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.uo.baseClassPkg.InitiateBrowser;
import org.wipro.automation.uo.pages.SignupPage;

public class SignupScenario extends InitiateBrowser
{

	@Test
	public void validate_signupfunc() throws Exception
	{
		SignupPage sign =new SignupPage(driver);
		
		sign.click_createnewaccountbttn();
		sign.enter_firstname("Selenium");
		
	}
	
}
