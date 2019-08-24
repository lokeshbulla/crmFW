package com.VTiger.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTiger.genericlib.WebDriverCommonlib;

public class CreateCampaingsPage  extends WebDriverCommonlib
{

	@FindBy(xpath="//img[@title=\"Create Campaign...\"]")
	private WebElement CreateCampaing;
	
	@FindBy(xpath="//input[@accesskey=\"S\"]")
	private WebElement saveButton;
	
	@FindBy(xpath="//img[@title=\"Select\"]")
	private WebElement SelectProductbutton;
	
	@FindBy(xpath="//input[@name='campaignname']")
	private WebElement CampName;
	@FindBy(xpath="//span[@class=\"dvHeaderText\"]")
	private WebElement Campresult;
	
	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getCampName() {
		return CampName;
	}

	public WebElement getCampresult() {
		return Campresult;
	}

	public  CreateCampaingsPage(WebDriver f)
	{
		PageFactory.initElements(f, this);
	}
	
	 public void CampaingsCreate(String CampaingName)
	 {
		 CampName.sendKeys(CampaingName);
		 //saveButton.click();
	 }
	 
	 private WebElement SelectProduct() throws Throwable
		{
		 String productname = lib.getExcelData("Product", 0, 0);
			WebElement Selectedproduct = f.findElement(By.xpath("//a[text()='"+productname+"']"));
			return Selectedproduct;
		}
	 
	 public WebElement getSelectProduct() throws Throwable {
			return SelectProduct();
		}
	 public WebElement getSelectProductbutton() {
			return SelectProductbutton;
		}
	 
	 public WebElement getCreateCampaing() {
			return CreateCampaing;
		}
	 
	 public WebElement getsaveButton() {
			return saveButton;
		}
	 public WebElement getcampaignname() {
			return CampName;
		}
	
}
