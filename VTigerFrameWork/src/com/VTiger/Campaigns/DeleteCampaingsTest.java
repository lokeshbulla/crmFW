package com.VTiger.Campaigns;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.VTiger.POM.DeleteCampaings;
import com.VTiger.POM.HomePage;
import com.VTiger.genericlib.BaseClass;
import com.VTiger.genericlib.Filelib;


@Listeners(com.VTiger.genericlib.Listenerspage.class)
public class DeleteCampaingsTest extends BaseClass
{
	@Test
	public void TestDeleteCampaings() throws Throwable
	{
		
		Filelib lib=new Filelib();
		
		String Campaingsname = lib.getExcelData("CampaingsName", 0, 0);
		wlib.implicitWait();
		
		HomePage hp=new HomePage(f);
		
		hp.getMoredd();
		hp.navigateToCampaign();
		
		DeleteCampaings dc=new DeleteCampaings(f);
		dc.getcheckbox().click();
		dc.getDeleteButton().click();
		wlib.acceptAlert();
		
		
		//validation
 
    	 WebElement result = dc.getDeleteResult();
    	 boolean res = result.isDisplayed();

    	
    	System.out.println(res);
    	if(res)
    	{
    		System.out.println("Campaings is Not Deleted ");
    	}
    	else
    	{
    		System.out.println("Campaings is Deleted Successfully ");
    	}
    	
		
		
		
		
	}

}
