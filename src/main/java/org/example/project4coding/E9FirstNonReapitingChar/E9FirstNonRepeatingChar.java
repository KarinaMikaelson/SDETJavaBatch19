package org.example.project4coding.E9FirstNonReapitingChar;

import java.util.HashMap;
import java.util.Map;

/*
9. Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character.
For example, in the string "abracadabra", the first non-repeating character is 'c'.
 */
public class E9FirstNonRepeatingChar { // Using HashMap approach
    public static Character returnNonRepeatingChar(String s ){
        //Create a HashMap to store frequency of each character
        Map<Character, Integer> charFreq = new HashMap<>();
        // Count frequency of each char in the String
        for(char c:s.toCharArray()){
            charFreq.put(c,charFreq.getOrDefault(c,0)+1);
        }
        //Find the first non-repeating char
        for(char c:s.toCharArray()){
            if(charFreq.get(c) == 1){
                return c;
            }
        }
        //if no non-repeating characters found, return null
        return null;
    }
    public static void main(String[] args) {
        String s = "abracadabra";
        Character result = returnNonRepeatingChar(s);
        System.out.println("First non-repeating character is "+result);
    }
}
