package com.gdccbank.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
				
	}
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUserName;
	
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(linkText="Manager")
	WebElement btnManager;
	
	@FindBy(linkText="New Customer")
	WebElement lnkNewCustomer;
	
	//@FindBy(xpath="//a[contains(text(),'Manager')]")
	
	
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void clickSubmit()
	{
		btnLogin.click();
	}
	public void clickManager()
	{
		btnManager.click();
		
	}
	
	public void clickNewCustomer()
	{
		lnkNewCustomer.click();
	}
}



