package com.VTiger.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTiger.genericlib.WebDriverCommonlib;

public class ProductPage extends WebDriverCommonlib
{

	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement CreateProduct;
	
	 public WebElement getCreateProduct() {
			return CreateProduct;
		}
	 
	 public  ProductPage(WebDriver f)
		{
			PageFactory.initElements(f, this);
		}
}
