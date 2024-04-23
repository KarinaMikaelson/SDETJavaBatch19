package org.example.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

// Method to reuse in other classes
public class ConfigReader {
    //public static
    public static String read(String key, String path) throws IOException {
        // This method can be used to read from any file
        FileInputStream fis = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fis);
        return properties.getProperty(key);
    }
    // We can Overload this method to avoid user enter path each time
    /*
    public static String read(String key) throws IOException {
     // this method (hardcoded path) can be used to read only given path file
     FileInputStream fis = new FileInputStream(Constants.CONFIG_FILE_PATH);
        // We just can hardcode the path here
        Properties properties = new Properties();
        properties.load(fis);
        return properties.getProperty(key);
    }
     */
        // We can simply re-use the first method
    public static String read(String key) throws IOException{
        return read(key,Constants.CONFIG_FILE_PATH); // re-using first method to Overload it, instead of writing it again
    }


}
