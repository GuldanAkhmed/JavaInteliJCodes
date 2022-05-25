package com.syntax.class32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo7 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\gulum\\OneDrive\\Desktop\\Config.properties\\Book1.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);

        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        Row row=sheet.createRow(6);
        row.getCell(0).setCellValue("Asel");
        row.getCell(1).setCellValue("AKiyatova");
        row.getCell(2).setCellValue(16);
        row.getCell(3).setCellValue("Almaty");
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);
    }
}
