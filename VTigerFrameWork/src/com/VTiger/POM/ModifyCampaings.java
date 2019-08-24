package com.VTiger.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTiger.genericlib.WebDriverCommonlib;

public class ModifyCampaings extends WebDriverCommonlib
{
	private WebElement CheckBox() throws Throwable
	{
		String Campaingsname = lib.getExcelData("CampaingsName", 0, 0);
		WebElement checkbox = f.findElement(By.xpath("//a[contains(text(),'"+Campaingsname+"')]/../..//input"));
		return checkbox;
	}
	
	public WebElement getCheckBox() throws Throwable {
		return CheckBox();
	}
	
	private WebElement EditButton() throws Throwable
	{
		String Campaingsname = lib.getExcelData("CampaingsName", 0, 0);
		WebElement edit = f.findElement(By.xpath("//a[contains(text(),'"+Campaingsname+"')]/../..//a[contains(text(),'edit')]"));
		return edit;
	}
	private WebElement EditResult() throws Throwable
	{
		String Campaingsname = lib.getExcelData("CampaingsName", 0, 0);
		String EditedData = lib.getExcelData("EditData", 0, 0);
		WebElement editresult = f.findElement(By.xpath("//a[contains(text(),'"+Campaingsname+"')]/../..//td[contains(text(),'"+EditedData+"')]"));
		return editresult;
	}
	
	public WebElement getEditResult() throws Throwable {
		return EditResult();
	}
	
	public WebElement getCampaignstatus() {
		return campaignstatus;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getSearchField() {
		return SearchField;
	}

	public WebElement getEditData() {
		return EditData;
	}

	public WebElement getSearchButton() {
		return SearchButton;
	}

	public WebElement getEditButton() throws Throwable {
		return EditButton();
	}
	
	@FindBy(xpath="//select[@name='campaignstatus']")
	private WebElement campaignstatus;
	
	@FindBy(xpath="//input[@accesskey=\"S\"]")
	private WebElement saveButton;
	
	@FindBy(xpath="//input[@name=\"search_text\"]")
	private WebElement SearchField;
	
	@FindBy(xpath="//select[@id=\"bas_searchfield\"]")
	private WebElement EditData;
	
	@FindBy(xpath="//input[@onclick=\"callSearch('Basic');\"]")
	private WebElement SearchButton;
	
	
	public WebElement getCampaingstatus() throws Throwable {
		return campaignstatus;
	}
	public WebElement getsavebutton() throws Throwable {
		return saveButton;
	}
	
	public  ModifyCampaings(WebDriver f)
	{
		PageFactory.initElements(f, this);
	}
	
}
