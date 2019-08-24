package com.VTiger.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductPage 
{

	@FindBy(xpath="//input[@name='productname']")
	private WebElement Pname;
	
	@FindBy(xpath="//input[@accesskey=\"S\"]")
	private WebElement saveButton;
	public  CreateProductPage(WebDriver f)
	{
		PageFactory.initElements(f, this);
	}
	
	public void CreateProduct(String Productname)
	{
		Pname.sendKeys(Productname);
		//saveButton.click();
	}

	public WebElement getPname() {
		return Pname;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
}
