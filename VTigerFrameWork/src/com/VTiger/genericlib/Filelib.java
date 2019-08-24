package com.VTiger.genericlib;


import java.io.FileInputStream;

import java.util.Properties;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelib
{
	public String getPropertyData(String key) throws Throwable
	{
	Properties p=new Properties();
	FileInputStream file=new FileInputStream("../VTigerFrameWork/CommanData.properties");
	
    p.load(file);
    String Value = p.getProperty(key);
	return Value;
	}
	
	public  String getExcelData(String sheet,int row,int cell) throws Throwable
	{
		Workbook workbook = WorkbookFactory.create(new FileInputStream("../VTigerFrameWork/TestScriptData.xlsx"));
		String value = workbook.getSheet(sheet).getRow(row).getCell(cell).toString();
		return value;
	}
}
