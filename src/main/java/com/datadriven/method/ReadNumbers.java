package com.datadriven.method;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadNumbers 
{

	public static void main(String[] args) throws Exception
	{
		File src=new File("/Users/Guga/MarksSheet.xls.numbers");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		String data0=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data0);	
		

	}

}
