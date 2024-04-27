package org.example.project4coding.E3ReverseString;

public class E3UsingChar {
    public static void main(String[] args) {
        String input = "Hello";

        // convert String to character array
        // by using toCharArray
        char[] toChar = input.toCharArray();

        for (int i = toChar.length - 1; i >= 0; i--)
            System.out.print(toChar[i]);
    }
}
