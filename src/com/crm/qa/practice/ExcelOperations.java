package com.crm.qa.practice;

import com.crm.qa.generics.BaseTest;
import com.crm.qa.util.Xls_Reader;

public class ExcelOperations extends BaseTest{
	
	public static void main(String[] args)
	{
		
		Xls_Reader reader = new Xls_Reader(path);
		System.out.println(reader.isSheetExist("HomePage"));
		if(!reader.isSheetExist("HomePage"))
		{
		reader.addSheet("HomePage");
		}
		
//		reader.addColumn("HomePage", "firstName");
//		reader.addColumn("HomePage", "lastName");
		
		reader.setCellData("HomePage", "firstName", 2, "Mounika");
		reader.setCellData("HomePage", "lastName", 2, "Vanka");
	}
}
