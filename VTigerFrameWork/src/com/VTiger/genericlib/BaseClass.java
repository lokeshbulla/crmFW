package com.VTiger.genericlib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.VTiger.POM.LoginPage;
import com.VTiger.POM.LogoutPage;


public class BaseClass
{
	public  static WebDriver f;
	public static Filelib lib=new Filelib();
	public static WebDriverCommonlib wlib=new WebDriverCommonlib();
	@BeforeTest
	public void OpenBrowser() throws Throwable
	{
		String browser = lib.getPropertyData("browser");
		if(browser.equals("chrome"))
		{
			 f=new ChromeDriver();
		}
		else 
		{
			f=new FirefoxDriver();
		}	 
	}

	@BeforeMethod
	public void loginPage() throws Throwable
	{
		String un = lib.getPropertyData("username");
		String pwd = lib.getPropertyData("password");
		String u = lib.getPropertyData("url");
		
		f.get(u);
		wlib.implicitWait();
		LoginPage login=new LoginPage(f);
		login.getlogin(un, pwd);
	}
	@AfterMethod
	public void logout() throws Throwable
	{
		LogoutPage lp=new LogoutPage(f);
		WebElement logout = lp.getLogout();
		wlib.Actionsclass(logout);
		lp.getLogoutButton().click();
	}
	
	@AfterTest
	public void Closebrowser()
	{
		f.quit();
	}
	
}
