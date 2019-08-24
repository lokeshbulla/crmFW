package com.VTiger.Organizations;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.VTiger.POM.CreateOrganizationPage;
import com.VTiger.POM.HomePage;
import com.VTiger.POM.OrganizationPage;
import com.VTiger.genericlib.BaseClass;

@Listeners(com.VTiger.genericlib.Listenerspage.class)
public class CreateOrganization extends BaseClass
{

	@Test
	public void TestCreateOrganization() throws Throwable
	{
		String Organizationname = lib.getExcelData("Organization", 0, 0);
		String websitename = lib.getExcelData("Organization", 1, 0);
		String BillingAddr = lib.getExcelData("Organization", 2, 0);
		String ShippingAddr = lib.getExcelData("Organization", 3, 0);
		
		wlib.implicitWait();
		HomePage hp=new HomePage(f);
		hp.getOrganization().click();
		
		OrganizationPage op=new OrganizationPage(f);
		op.getCreateOrg().click();
		
		CreateOrganizationPage co=new CreateOrganizationPage(f);
		
		co.CrtOraganization(Organizationname, websitename, BillingAddr, ShippingAddr);
		
		try {
			co.getSaveButton().click();
		}
		catch (Exception e) {
			wlib.acceptAlert();
			System.out.println("Organization Name Is Already Exist");
			f.quit();
		}
		
		//Validation
		WebElement result = co.getExpectedOrgName();
		
		String name = result.getText();
		assertEquals(name,Organizationname);
		
	}
}
