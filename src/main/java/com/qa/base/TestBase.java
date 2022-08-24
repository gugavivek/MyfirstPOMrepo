package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.TestUtil;

public class TestBase
{
public static WebDriver driver;
public static Properties prop;
//Reading file of 
public TestBase()
{
	{
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com"
			+ "/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}



@SuppressWarnings("deprecation")
public static void Invokingbrowser()
{
		String browsertype=prop.getProperty("browser");
	if(browsertype.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "/Users/Guga/Documents/Selenium/chromedriver/chromedriver");
		driver=new ChromeDriver();
		}
	else if(browsertype.equals("safari"))
		{
		System.setProperty("webdriver.chrome.driver", "/Users/Guga/Documents/Selenium/chromedriver/safaridriver/selenium-safari-driver-4.3.0 (1).jar");
		driver=new ChromeDriver();
		}
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get(prop.getProperty("url"));
	}
}
