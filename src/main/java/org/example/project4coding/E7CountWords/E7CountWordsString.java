package org.example.project4coding.E7CountWords;
/*
7. Count the Number of Words in a String: Write a function to count the number of words in a given string.
Words are separated by spaces or punctuation.
 For example, the input "Hello, world!" should return 2.
 */
public class E7CountWordsString {
    public static void main(String[] args) {
        String sentence = "Hello, world!";
        System.out.println(countWords(sentence));
    }

    public static int countWords(String sentence){
        //Split the sentence by whitespace and punctuation
        String [] words = sentence.split("[\\s\\p{Punct}]+"); // Regular expression to split
        //Return the length of the array, which represents the number of words
        return words.length;
    }
}
