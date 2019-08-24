package com.VTiger.genericlib;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonlib extends BaseClass
{
	String parentID ;
	Set<String> allID ;

	public void ChildWindowClass(String url) throws Throwable
	{
		
			
				//ALL SessionID
			parentID = f.getWindowHandle();
			allID = f.getWindowHandles();
				Iterator<String> It=allID.iterator();
						while(It.hasNext())
						{
							String SID=It.next();
							f.switchTo().window(SID);
							String CurrentPageURL=f.getCurrentUrl();
							if(CurrentPageURL.equals(url))
							{
								break;
							}
						}
				
						
								
	}
	public void switchToParent()
	{
	//	parentID = f.getWindowHandle();
		f.switchTo().window(parentID);
	}
	
	public void Actionsclass(WebElement ele) throws Throwable  {
		
		Actions a=new Actions(f);
		Thread.sleep(2000);
		a.moveToElement(ele).perform();
		
	}


	public void Selectclass(WebElement listbox,String box) {
		
		Select s=new Select(listbox);
		s.selectByVisibleText(box);
		
	}
	
	public void implicitWait()
	{
	f.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void WaitForElementPresent()
	{
		WebDriverWait wait=new WebDriverWait(f, 10);
		wait.until(ExpectedConditions.visibilityOfAllElements());
	}
	public void acceptAlert()
	{
		f.switchTo().alert().accept();
	}
	
	public String gerAlertText()
	{
		 String AlertText = f.switchTo().alert().getText();
	return AlertText;
		
	}

}
