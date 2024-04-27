package org.example.project4coding.E5AnagramString;

import java.util.Arrays;

/*
 5. Check if Two Strings are Anagrams: Given two strings, determine if they are anagrams,
 meaning they contain the same characters in a different order.
 For example, "listen" and "silent" are anagrams.
 */
public class E5AnagramStrings {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(AnagramChecker.areAnagrams(str1, str2)); // Output: true
    }
}
class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
/*
An anagram is a word or phrase formed by rearranging the letters of another word or phrase,
using all the original letters exactly once.
For example, "listen" and "silent" are anagrams of each other because they contain the same letters,
just in a different order.
 */
