package org.example.utils;

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

public class ExcelReader {
    public static List<Map<String, String>> read(String path, String sheetName) throws IOException {
        //Navigate to the file / bringing into Java program
        FileInputStream fileInputStream = new FileInputStream(path);
        // A class that helps us read/write Excel Files
        XSSFWorkbook excelFile = new XSSFWorkbook(fileInputStream);
        // Accessing sheet from excel file
        Sheet sheet = excelFile.getSheet(sheetName);

        List<Map<String, String>> excelData = new ArrayList<>();
        Row headerRow = sheet.getRow(0);
        // Extracting the first row to use as keys for the map
        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            Map<String,String> rowMap = new LinkedHashMap<>();
            Row row = sheet.getRow(i);
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                String key = headerRow.getCell(j).toString(); //Extracting the headerRow which is the KEY
                String value = row.getCell(j).toString(); // Extracting the ROWS which are the values
                rowMap.put(key, value);
            }
            excelData.add(rowMap);
        }
        return excelData;
    }

    public static List<Map<String, String>> read(String sheetName) throws IOException {
        return read(Constants.EXCEL_FILE_PATH,sheetName);
    }
    public static List<Map<String, String>> read() throws IOException {
        return read(Constants.EXCEL_FILE_PATH,"Sheet1");
    }
}