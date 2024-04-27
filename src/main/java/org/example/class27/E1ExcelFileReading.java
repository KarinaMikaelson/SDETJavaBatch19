package org.example.class27;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E1ExcelFileReading {
    public static void main(String[] args) throws IOException {
        //Location of the file
        String path = "/Users/karina/IdeaProjects/SDETJavaBatch19/Files/Batch19TestData (2).xlsx";
        //Navigate to the file / bringing into Java program
        FileInputStream fileInputStream = new FileInputStream(path);
        // A class that helps us read/write Excel Files
        XSSFWorkbook excelFile = new XSSFWorkbook(fileInputStream);
        // XSSFWorkbook class - only for excel files
        // Accessing sheet from excel file
        Sheet sheet = excelFile.getSheet("Sheet1");

        List<Map<String,String>> excelData = new ArrayList<>();
        Row headerRow = sheet.getRow(0);
        // Extracting the first row to use as keys for the map
        for(int i = 1; i < sheet.getPhysicalNumberOfRows(); i++){
            Map<String,String> rowMap = new LinkedHashMap<>();
            Row row = sheet.getRow(i);
            for(int j = 0; j < row.getPhysicalNumberOfCells(); j++){
                String key = headerRow.getCell(j).toString(); //Extracting the headerRow which is the KEY
                String value = row.getCell(j).toString(); // Extracting the ROWS which are the values
                rowMap.put(key,value);
            }
            excelData.add(rowMap);
        }
        System.out.println(excelData);
    }
}
