package com.crm.qa.generics;

import java.util.ArrayList;

import com.crm.qa.generics.Xls_Reader;

public class ExcelUtil extends BaseTest
{

	public static ArrayList<Object[]> getDataFromExcel()
	{
		
		Xls_Reader reader = new Xls_Reader(path);
		
		int rowCount =	reader.getRowCount("EbayReg");
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();	
		
		reader.addColumn("EbayReg", "Status");
		for(int rowNum=2;rowNum<=rowCount;rowNum++)
		{	
		String firstName = reader.getCellData("EbayReg", "firstName", rowNum);
		String lastName =  reader.getCellData("EbayReg", "LastName", rowNum);
		String emailAddress = reader.getCellData("EbayReg", "EmailAddress", rowNum);
		String password = reader.getCellData("EbayReg", "Password", rowNum);		
		
		Object ob[] = {firstName,lastName,emailAddress,password};
		myData.add(ob);
		
		reader.setCellData("EbayReg", "Status", rowNum, "pass");
		
		}
		
		return myData;
	}
	
}					

