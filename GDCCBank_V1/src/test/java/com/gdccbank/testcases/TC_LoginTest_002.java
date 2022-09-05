package com.gdccbank.testcases;
import org.junit.Assert;
import org.testng.annotations.Test;
import com.gdccbank.pageobjects.LoginPage;

public class TC_LoginTest_002 extends BaseClass {

	
	
	@Test
	public void loginTest()
	{
		driver.get(baseURL);
		Logger.info("URL Opened");

		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(username);
		Logger.info("Entered UserName");
		lp.setPassword(password);
		Logger.info("Entered Password");
		lp.clickSubmit();
		Logger.info("Clciked on Submit");
		
		
		//System.out.println("Title of the Entered Page:"+driver.getTitle());
		
		String ExpectedTitle=driver.getTitle();
		
		
		
		if(driver.getTitle().equals(ExpectedTitle))
		{
			Assert.assertTrue(true);
			Logger.info("Logged in Successful");
		}
		else 
		{
			Assert.assertTrue(false);
			Logger.info("Logged in Failed");
		}
		
		//lp.clickManager();
		
	
	}
}
