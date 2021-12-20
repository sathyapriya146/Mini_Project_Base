package com.Data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	public static void read_Paticular_Data() throws IOException {
		File f = new File("D:\\sathyapriya\\Dec_Mini_Project\\Data_Driven.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(2);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		System.out.println("PARTICULAR DATA : ");
		System.out.println("=================");
		if (cellType.equals(cellType.STRING)) {
			String value = cell.getStringCellValue();
			System.out.println(value);
			
		}
		else if (cellType.equals(cellType.NUMERIC)) {
		double cellValue = cell.getNumericCellValue();	
		int value = (int) cellValue;
		System.out.println(value);
		
		}
		
	}
	
	
	public static void all_Data() throws IOException {
		File f = new File("D:\\sathyapriya\\Dec_Mini_Project\\Data_Driven.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		System.out.println();
		System.out.println("ALL DATA : ");
		System.out.println("==========");
		
		for (int i = 0; i < numberOfRows; i++) {
			
			Row row = sheetAt.getRow(i);
			
			int numberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < numberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(cellType.STRING)) {
					String value = cell.getStringCellValue();
					System.out.println(value);
					
				}
				else if (cellType.equals(cellType.NUMERIC)) {
				double cellValue = cell.getNumericCellValue();	
				int value = (int) cellValue;
				System.out.println(value);
				}			
				
				
			}
			
				
		}
				
	
	}
	
public static void main(String[] args) throws IOException {
read_Paticular_Data();
all_Data();	
	
	}
}
