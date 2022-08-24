package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage  extends TestBase 
{
	//WebElements for locating
@FindBy(name="username")
WebElement username4login;

@FindBy(name="password")
WebElement password4login;

@FindBy(xpath="//input[@type='submit']")
WebElement LoginButton;

@FindBy(xpath="//a[contains(@class,'navbar-brand')]//img[contains(@class,'img-responsive')]")
WebElement CRMlogo;
//intializing the page objects /object repository using PageFactory class
public LoginPage()
{
	PageFactory.initElements(driver,this);
}
public String verifytitle()
{
	 return driver.getTitle();
}
public boolean validatecrmimage()
{
	boolean validate=CRMlogo.isDisplayed();
	return validate;
	
}
public void Login(String UM,String PWD)
{
	username4login.sendKeys(UM);
	password4login.sendKeys(PWD);
	LoginButton.click();
	//JavascriptExecutor javascript=(JavascriptExecutor)driver;
	//javascript.executeScript("arguments[0].click()"	, LoginButton); 
		
}

}
