package com.Data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Particular_Row_Column {
	public static void particular_Row() throws IOException {
		File f = new File("D:\\sathyapriya\\Dec_Mini_Project\\Data_Driven.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		int numberOfCells = row.getPhysicalNumberOfCells();
		System.out.println("PARTICULAR ROW : ");
		System.out.println("=================");
		for (int i = 0; i < numberOfCells; i++) {
			Cell cell = row.getCell(i);
			CellType cellType = cell.getCellType();
			if (cellType.equals(cellType.STRING)) {
				String value = cell.getStringCellValue();
				System.out.println(value);
			} else if (cellType.equals(cellType.NUMERIC)) {
				double cellValue = cell.getNumericCellValue();
				int value = (int) cellValue;
				System.out.println(value);
			}
		}
	}
	public static void particular_Column() throws IOException {
		File f = new File("D:\\sathyapriya\\Dec_Mini_Project\\Data_Driven.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		System.out.println();
		System.out.println("PARTICULAR COLUMN : ");
		System.out.println("=================");
		for (int i = 1; i < numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			short cellNum = row.getFirstCellNum();
			for (int j = 0; j <= cellNum; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(cellType.STRING)) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				} else if (cellType.equals(cellType.NUMERIC)) {
					double cellValue = cell.getNumericCellValue();
					int value = (int) cellValue;
					System.out.println(value);
				}
			}
		}
	}
//D:\\Doc\\Report_Demoo.log
	public static void main(String[] args) throws IOException {
		particular_Row();
		particular_Column();
	}
}
