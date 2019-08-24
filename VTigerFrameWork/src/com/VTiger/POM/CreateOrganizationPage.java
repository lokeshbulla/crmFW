package com.VTiger.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage 
{

	@FindBy(xpath="//input[@name='accountname']")
			private WebElement OrgName;
	
	@FindBy(xpath="//input[@name='website']")
	private WebElement WebName;
	
	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement BillStreet;
	
	@FindBy(xpath="//textarea[@name='ship_street']")
	private WebElement ShipStreet;
	
	@FindBy(xpath="//input[@accesskey=\"S\"]")
	private WebElement saveButton;
	
	@FindBy(xpath="//span[@id='dtlview_Organization Name']")
	private WebElement ExpectedOrgName;

	
	public WebElement getExpectedOrgName() {
		return ExpectedOrgName;
	}
	public void CrtOraganization(String Organizationname,String websitename,String BillingAddr,String ShippingAddr)
	{
		OrgName.sendKeys(Organizationname);
		WebName.sendKeys(websitename);
		BillStreet.sendKeys(BillingAddr);
		ShipStreet.sendKeys(ShippingAddr);
		
		
	}
	public  CreateOrganizationPage(WebDriver f)
	{
		PageFactory.initElements(f, this);
	}
	public WebElement getOrgName() {
		return OrgName;
	}
	public WebElement getWebName() {
		return WebName;
	}
	public WebElement getBillStreet() {
		return BillStreet;
	}
	public WebElement getShipStreet() {
		return ShipStreet;
	}
	public WebElement getSaveButton() {
		return saveButton;
	}
}
