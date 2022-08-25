package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase

{
	LoginPage loginpage;
	HomePage homepage;

	

	public LoginPageTest()
	{
		super();
	}

	@BeforeClass
	public void Initializebrowser()
	{
		Invokingbrowser();
		loginpage=new LoginPage();
		homepage=new HomePage();
	
	}
	@Test(priority=1)
	public void loginPagetitleverify()
	{
		String loginpagetitle=loginpage.verifytitle();
		Assert.assertEquals(loginpagetitle,"Free CRM - CRM software for customer relationship management, sales, and support.");
	}
	@Test(priority=2)
	public void loginpagelogoverify()
	{
		boolean flag=loginpage.validatecrmimage();
		Assert.assertTrue(flag);
		
	}
	@Test(priority=3)
	public void logintohomepage()
	
	{
		//new LoginPage();
		loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		
				
	}
	
	//CLOSING THE SESSION
	
	@AfterClass
	public void teardown()
	{
		//driver.quit();
	}
	
	
	
	
	
	
}
