package com.VTiger.Campaigns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.VTiger.POM.HomePage;
import com.VTiger.POM.ModifyCampaings;
import com.VTiger.genericlib.BaseClass;


@Listeners(com.VTiger.genericlib.Listenerspage.class)
public class EditCampaings extends BaseClass
{
	@Test
	public void TestEditCampaings() throws Throwable
	{
		String Campaingsname = lib.getExcelData("CampaingsName", 0, 0);
		String EditedData = lib.getExcelData("EditData", 0, 0);
		
		HomePage hp=new HomePage(f);
		hp.getMoredd();
		hp.navigateToCampaign();
		
		ModifyCampaings mc=new ModifyCampaings(f);
		mc.getCheckBox().click();
		mc.getEditButton().click();
		WebElement listbox = mc.getCampaingstatus();
		
		wlib.Selectclass(listbox, ""+EditedData+"");
		mc.getsavebutton().click();
		
		
		//validation
		
		mc.getSearchField().sendKeys(EditedData);
		WebElement listbox1 = mc.getEditData();
		
		wlib.Selectclass(listbox1, "Campaign Status");
		
		mc.getSearchButton().click();
		
		WebElement editresult = mc.getEditResult();
		String editedText = editresult.getText();
		System.out.println(editedText);
		//Assert.assertEquals(editedText, EditedData);
		if(editedText.equals(""+EditedData+""))
		{
			System.out.println("Modification of Campaings successfully");
		}
		else
		{
			System.out.println("Modification of Campaings not successfully");
			
		}
	}

}
