package com.VTiger.genericlib;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;




	public class Listenerspage extends BaseClass implements ITestListener 

	{


		@Override
		public void onTestStart(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			
		}

		@Override
		public void onTestFailure(ITestResult result) {
			
			String fail = result.getMethod().getMethodName();
			TakesScreenshot shot=(TakesScreenshot)f;
			File scr = shot.getScreenshotAs(OutputType.FILE);
			File dest=new File("./Screenshot/"+fail+".png");
			
				try {
					FileUtils.copyFile(scr, dest);
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onStart(ITestContext context) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
			
		}
		

	}


