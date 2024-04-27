package org.example.class27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E9Exception {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            FileInputStream fis = new FileInputStream("/Users/karina/IdeaProjects/SDETJavaBatch19/Files/Batch19TestData (2).xlsx");
        }catch (FileNotFoundException f){
            System.out.println("Backup code");
        }

    }
}
