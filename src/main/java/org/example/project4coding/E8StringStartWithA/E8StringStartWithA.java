package org.example.project4coding.E8StringStartWithA;

import java.util.ArrayList;
import java.util.List;

/*
8. You have a list of strings and you want to keep only those that
start with “A” and you want to return them in lower case".
 */
public class E8StringStartWithA {
    public static void main(String[] args) {
        //Lambda expression
        List<String> cityList = new ArrayList<>();
        cityList.add("Astana");
        cityList.add("Paris");
        cityList.add("Amsterdam");
        cityList.add("London");
        cityList.add("Dublin");
        cityList.add("Antalya");

        cityList.removeIf(x->!x.toLowerCase().startsWith("a"));
        System.out.println(cityList);


    }
}
