package org.example.class26;
/*
How to not print, BUT store this info in java
 */
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.apache.poi.ss.usermodel.TableStyleType.headerRow;

public class E5ExcelReader {
    public static void main(String[] args) throws IOException {
        //Location of the file
        String path = "/Users/karina/IdeaProjects/SDETJavaBatch19/Files/Batch19TestData (2).xlsx";
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook excel = new XSSFWorkbook(fis);
        // XSSFWorkbook class - only for excel files
        Sheet sheet = excel.getSheet("Sheet1");

        Row headerRow = sheet.getRow(0);
        List<Map<String,String>> excelData = new ArrayList<>();

        for(int i = 1; i < sheet.getPhysicalNumberOfRows(); i++){
            Row row = sheet.getRow(i);
            Map<String,String> rowMap = new LinkedHashMap<>();

            for(int j = 0; j < row.getPhysicalNumberOfCells(); j++){
                Cell cell = row.getCell(j);
                String key = headerRow.getCell(j).toString();
                String value = row.getCell(j).toString();
                rowMap.put(key,value);
            }
            excelData.add(rowMap);
        }
        System.out.println(excelData);
    }
}
