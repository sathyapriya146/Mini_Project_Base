package com.Data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
public static void write_Data() throws IOException {
	File f = new File("D:\\sathyapriya\\Dec_Mini_Project\\Data_Driven.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
//	Sheet sheetAt = wb.getSheetAt(0);
//	Row row = sheetAt.getRow(2);
//	Cell cell = row.getCell(0);
//	CellType cellType = cell.getCellType();
 
	
	wb.createSheet("Data").createRow(0).createCell(0).setCellValue("Username");
	wb.getSheet("Data").getRow(0).createCell(1).setCellValue("password");
	wb.getSheet("Data").createRow(1).createCell(0).setCellValue("mano");
	wb.getSheet("Data").getRow(1).createCell(1).setCellValue(123);
	FileOutputStream fos = new FileOutputStream(f);
	
	wb.write(fos);
	wb.close();
	System.out.println("Write Successfully");
}
public static void main(String[] args) throws IOException {
	write_Data();
}
}
