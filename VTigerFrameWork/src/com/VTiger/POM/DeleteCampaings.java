package com.VTiger.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTiger.genericlib.WebDriverCommonlib;

public class DeleteCampaings extends WebDriverCommonlib
{
	@FindBy(xpath="//input[@class='crmbutton small delete']")
	private WebElement DeleteButton;
	
	private WebElement checkbox() throws Throwable
	{
		String Campaingsname = lib.getExcelData("CampaingsName", 0, 0);
		WebElement cb = f.findElement(By.xpath("//a[contains(text(),'"+Campaingsname+"')]/../..//input"));
		return cb;
	}
	
	private WebElement DeleteResult() throws Throwable
	{
		String Campaingsname = lib.getExcelData("CampaingsName", 0, 0);
		  WebElement Deleteresult = f.findElement(By.xpath("//a[contains(text(),'"+Campaingsname+"')]"));
		return Deleteresult;
	}
	public WebElement getDeleteResult() throws Throwable
	{
		return DeleteResult();
	}
	
	
	public  DeleteCampaings(WebDriver f)
	{
		PageFactory.initElements(f, this);
	}
	
	
	public WebElement getcheckbox() throws Throwable
	{
		return checkbox();
	}
	
	public WebElement getDeleteButton() throws Throwable
	{
		return DeleteButton;
	}
	
}
