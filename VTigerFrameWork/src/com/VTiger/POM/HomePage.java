package com.VTiger.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTiger.genericlib.WebDriverCommonlib;

public class HomePage extends WebDriverCommonlib
{
	
	@FindBy(xpath="//a[text()='Products']")
	private WebElement productTab;
	
	@FindBy(linkText="More")
	private WebElement moredd;
	
	@FindBy(linkText="Campaigns")
	private WebElement campLnk;
	
	@FindBy(linkText="Contacts")
	private WebElement contactLnk;
	
	@FindBy(xpath="//td[@class='tabUnSelected']/a[contains(text(),'Organizations')]")
	private WebElement Organization;
	
/*	public void moveToModule(String moduleName, WebDriver driver) throws Throwable {
		Actionsclass(moredd);
	   driver.findElement(By.linkText(moduleName)).click();
	}
	*/
	public void navigateToCampaign() throws Throwable {
		Actionsclass(moredd);
		campLnk.click();
      
	}
	public void navigateToOrganization() throws Throwable {
		Actionsclass(moredd);
		Organization.click();
      
	}
	public WebElement getProductTab() {
		return productTab;
	}
	public WebElement getMoredd() {
		return moredd;
	}
	public WebElement getCampLnk() {
		return campLnk;
	}
	public WebElement getContactLnk() {
		return contactLnk;
	}
	public WebElement getOrganization() {
		return Organization;
	}
	public void navigateToContact() throws Throwable {
		Actionsclass(moredd);
		contactLnk.click();
      
	}
	public  HomePage(WebDriver f)
	{
		PageFactory.initElements(f, this);
	}

}
