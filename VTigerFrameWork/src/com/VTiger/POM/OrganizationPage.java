package com.VTiger.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage 
{
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement CreateOrg;

	public WebElement getCreateOrg() {
		return CreateOrg;
	}
	public  OrganizationPage(WebDriver f)
	{
		PageFactory.initElements(f, this);
	}
	
	
	

}
