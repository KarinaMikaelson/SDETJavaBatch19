package org.example.project4coding.E3ReverseString;
/*
/*
3. Reverse a String: Write a function to reverse a given string.
For example, given the input "Hello", the output should be "olleH".
 */   //USING StringBuilder

public class E3EasyWay {
    public static void main(String[] args) { //USING StringBuilder
        String input = "Hello";
        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(input);

        // reverse StringBuilder input1
        input1.reverse();

        // print reversed String
        System.out.println(input1);
    }
}
