package com.VTiger.Campaigns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.VTiger.POM.CreateCampaingsPage;
import com.VTiger.POM.CreateProductPage;
import com.VTiger.POM.HomePage;
import com.VTiger.POM.ProductPage;
import com.VTiger.genericlib.BaseClass;

@Listeners(com.VTiger.genericlib.Listenerspage.class)
public class CreateCampaingsTest extends BaseClass
{

	@Test
	public void TestCreatCampaings() throws Throwable
	
	{
		String productname = lib.getExcelData("Product", 0, 0);
		String Campaingsname = lib.getExcelData("CampaingsName", 0, 0);
		wlib.implicitWait();
		HomePage hp=new HomePage(f);
		hp.getProductTab().click();
		
		ProductPage pp=new ProductPage(f);
		pp.getCreateProduct().click();
		
		CreateProductPage cpp=new CreateProductPage(f);
		cpp.CreateProduct(productname);
		cpp.getSaveButton().click();;
		
		hp.getMoredd();
		hp.navigateToCampaign();
		
		
		
		

	//actionClass
		
		CreateCampaingsPage cc=new CreateCampaingsPage(f);
		cc.getCreateCampaing().click();

		cc.CampaingsCreate(Campaingsname);
		cc.getsaveButton().click();;
		
		//f.findElement(By.xpath("//img[@title=\"Create Campaign...\"]")).click();
		//f.findElement(By.xpath("//input[@name='campaignname']")).sendKeys(Campaingsname);
		/*f.findElement(By.xpath("//img[@title=\"Select\"]")).click();
		
		
		String url = "localhost:8888/index.php?module=Products&action=Popup&html=Popup_picker&form=HelpDeskEditView&popuptype=specific&fromlink=";
		wlib.ChildWindowClass(url);
		
		f.findElement(By.xpath("//a[text()='"+productname+"']")).click();
		
		Thread.sleep(3000);
		wlib.switchToParent();*/
	
		//f.findElement(By.xpath("//input[@accesskey=\"S\"]")).click();
		//validation=================================
		//Thread.sleep(3000);
		System.out.println("===========================");
		WebElement result = cc.getCampresult();
		//WebElement result = f.findElement(By.xpath("//span[@class=\"dvHeaderText\"]"));
		
		
		String Text = result.getText();
		System.out.println(Text);
		Assert.assertTrue(Text.contains(Campaingsname));
		
	}
	
}
