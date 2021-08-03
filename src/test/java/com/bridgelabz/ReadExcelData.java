package com.bridgelabz;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.IOException;

public class ReadExcelData {
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    public int getRowCount() {
        int rowCount = 0;
        try {
            workbook = new XSSFWorkbook("TestData/LoginData.xlsx");
            sheet = workbook.getSheet("Sheet1");
            rowCount = sheet.getPhysicalNumberOfRows();
            System.out.println("Total number of Rows are :- " +rowCount);
        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
        }
        return rowCount;
    }
    public int getColCount() {
        int colCount = 0;
        try {
            workbook = new XSSFWorkbook("TestData/LoginData.xlsx");
            sheet = workbook.getSheet("Sheet1");
            colCount = sheet.getRow(0).getPhysicalNumberOfCells();
            System.out.println("Total number of Column are :- " +colCount);
        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
        }
        return colCount;
    }
    public String getCellDataString(int rownum, int colnum) {
        String cellData = null;
        try {
            workbook = new XSSFWorkbook("TestData/LoginData.xlsx");
            sheet = workbook.getSheet("Sheet1");
            cellData = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
//            System.out.println("Cell Data :- " +cellData);
        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
        }
        return cellData;
    }
}
