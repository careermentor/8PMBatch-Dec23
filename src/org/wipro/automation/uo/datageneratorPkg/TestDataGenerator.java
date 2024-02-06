package org.wipro.automation.uo.datageneratorPkg;

import org.testng.annotations.DataProvider;

public class TestDataGenerator 
{


	@DataProvider(name="staticdata")
	public Object[][] testdata()
	{
		//Object[] data1 = {"user1","pass1"};  //1-dimensional array
		
		Object[][] data = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};  //2-dimensional array
		return data;
		
	}
	
	
	@DataProvider(name="staticdata1")
	public Object[][] testdata1()
	{
		//Object[] data1 = {"user1","pass1"};  //1-dimensional array
		
		Object[][] data1 = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};  //2-dimensional array
		return data1;
		
	}
}
