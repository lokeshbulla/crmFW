package com.VTiger.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage 
{

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement logout;

	@FindBy(xpath="//a[contains(text(),'Sign Out')]")
	private WebElement logoutButton;
	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	public  LogoutPage(WebDriver f)
	{
		PageFactory.initElements(f, this);
	}
}
