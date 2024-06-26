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
        //Navigate to the file / bringing into Java program
        FileInputStream fis = new FileInputStream(path);
        // A class that helps us read/write Excel Files
        XSSFWorkbook excel = new XSSFWorkbook(fis);
        // XSSFWorkbook class - only for excel files
        // Accessing sheet from excel file
        Sheet sheet = excel.getSheet("Sheet1");
        // a simple data structure to hold the data from Excel file
        List<Map<String,String>> excelData = new ArrayList<>();
        Row headerRow = sheet.getRow(0);
        // Extracting the first row to use as keys for the map
        for(int i = 1; i < sheet.getPhysicalNumberOfRows(); i++){

            Map<String,String> rowMap = new LinkedHashMap<>();
            Row row = sheet.getRow(i);
            for(int j = 0; j < row.getPhysicalNumberOfCells(); j++){
                Cell cell = row.getCell(j);
                String key = headerRow.getCell(j).toString(); //Extracting the headerRow which is the KEY
                String value = row.getCell(j).toString(); // Extracting the ROWS which are the values
                rowMap.put(key,value);
            }
            excelData.add(rowMap);
        }
        System.out.println(excelData);
    }
}
