package com.crm.qa.generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData 
{

	
	public static String getData(String path,String Sheet,int rn,int cn) throws Exception
	{
		
		FileInputStream fis = new FileInputStream(new File(path));
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(Sheet).getRow(rn).getCell(cn).toString();
		return data;
	}
	
	public static int getRowCount(String path,String Sheet) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream(new File(path));
		Workbook wb = WorkbookFactory.create(fis);
		int rn = wb.getSheet(Sheet).getLastRowNum();
		return rn;
	}
	
	public static short getCellCount(String path,String Sheet,int rn) throws Exception
	{
		FileInputStream fis = new FileInputStream(new File(path));
		Workbook wb = WorkbookFactory.create(fis);
		short cn = wb.getSheet(Sheet).getRow(rn).getLastCellNum();
		return cn;
	
	}
	

}
