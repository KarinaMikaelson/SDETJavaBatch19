package org.example.class27;

import org.example.utils.Constants;
import org.example.utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class E2ExcelReading {
    public static void main(String[] args) throws IOException {
        var data = ExcelReader.read(Constants.EXCEL_FILE_PATH,"Sheet1");
        System.out.println(data.get(3));
        System.out.println(data.get(3).get("Age"));
    }
}
