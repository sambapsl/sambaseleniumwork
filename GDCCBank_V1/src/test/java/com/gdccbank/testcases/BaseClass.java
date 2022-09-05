package com.gdccbank.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.gdccbank.utilities.ReadConfig;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



public class BaseClass {
	
	ReadConfig rc=new ReadConfig();
	public String baseURL=rc.getAppURL();
	public String username=rc.getUserName();
	public String password=rc.getPassWord();
	public static WebDriver driver;
	public static  Logger Logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		Logger=Logger.getLogger("GDCCBank_V1");
		PropertyConfigurator.configure("Log4j.properties");
		 
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",rc.getChrome());
			driver=new ChromeDriver();
		}else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",rc.getFireFox());
			driver=new FirefoxDriver();
		}
		
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
