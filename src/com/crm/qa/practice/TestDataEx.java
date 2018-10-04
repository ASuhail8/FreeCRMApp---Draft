package com.crm.qa.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestDataEx 
{

	//public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException
	//{
	
	public static void getTestData() throws Exception
	{
	File file = new File("./data/input.xlsx");
	FileInputStream fis = new FileInputStream(file);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("Suhail");
	Row r = sh.getRow(4);	
	Cell c = r.getCell(2);
	String data = c.toString();	
	System.out.println(data);			
	}
	
	
	
	
	
}
