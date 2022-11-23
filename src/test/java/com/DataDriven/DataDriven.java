package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	public static void ParticularData() throws IOException {
		File file = new File("D:\\java-2022-062\\eclipse\\Adactin_MavenProject\\Excel\\IndhuExcel.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(0);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		if(cellType.equals(cellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}
		else if (cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int value = (int) numericCellValue;
			System.out.println(value);
		}
	}
	public static void AllData() throws IOException {
		File f = new File("D:\\java-2022-062\\eclipse\\Adactin_MavenProject\\Excel\\IndhuExcel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
	for (int i = 0; i < physicalNumberOfRows; i++) {
		Row row = sheetAt.getRow(i);
		
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
	  for (int j = 0; j < physicalNumberOfCells; j++) {
		 Cell cell = row.getCell(j);
		 CellType cellType = cell.getCellType();
		 
		 if(cellType.equals(cellType.STRING)) {
		 String stringCellValue = cell.getStringCellValue();
		 	System.out.println(stringCellValue);
		 }
		 else if (cellType.equals(cellType.NUMERIC)) {
			 double numericCellValue = cell.getNumericCellValue();
			 int value = (int) numericCellValue;
			 	System.out.println(value);
		 }
	}}
	
	}	
	//Write:
	public static void main(String[] DataWrite) throws IOException {
		AllData();
		File f = new File("D:\\java-2022-062\\eclipse\\Adactin_MavenProject\\Excel\\IndhuExcel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		wb.createSheet("Cricket").createRow(0).createCell(0).setCellValue("NAME");
		wb.getSheet("Data").getRow(0).createCell(1).setCellValue("AGE");
		wb.getSheet("Data").createRow(1).createCell(0).setCellValue("ROHIT");
		wb.getSheet("Data").getRow(1).createCell(1).setCellValue("40");
		wb.getSheet("Data").createRow(2).createCell(0).setCellValue("SKY");
		wb.getSheet("Data").getRow(2).createCell(1).setCellValue("35");
		wb.getSheet("Data").createRow(3).createCell(0).setCellValue("HP");
		wb.getSheet("Data").getRow(0).createCell(1).setCellValue("29");
		
		FileOutputStream os = new FileOutputStream(f);
		wb.write(os);
		wb.close();
		
		System.out.println("Successfully");
	}
		
		
}

