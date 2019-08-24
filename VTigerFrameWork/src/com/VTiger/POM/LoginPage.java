package com.VTiger.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	@FindBy(name="user_name")
	private WebElement user;
	
	@FindBy(name="user_password")
	private WebElement pass;
	
	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy(id="submitButton")
	private WebElement login;
	
	public  LoginPage(WebDriver f)
	{
		PageFactory.initElements(f, this);
	}

	public void getlogin(String un, String pwd) {
		user.sendKeys(un);
		pass.sendKeys(pwd);	
		login.click();
	}

}
