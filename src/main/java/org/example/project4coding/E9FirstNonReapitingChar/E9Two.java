package org.example.project4coding.E9FirstNonReapitingChar;

/*
9. Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character.
For example, in the string "abracadabra", the first non-repeating character is 'c'.
-----------------------------------------------------------------------
	•	The for loop iterates through each character in the string.
	•	For each character, it uses s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) to find the index
	    of the next occurrence of the character in the string.
	•	If the result is -1, it means that the character only appears once in the string (i.e., it does
	    not occur again after its current position). In this case, it prints the character as the first
	    non-repeating character and breaks out of the loop.

This approach has a time complexity of O(n^2), where n is the length of the string, because for each character in the string,
it potentially searches through the entire string again to find the next occurrence. While it works fine for small strings,
it may not be the most efficient approach for large strings.

Using a data structure like a HashMap or an array to store the frequency of each character would provide a more efficient solution,
especially for larger strings, as it would have a time complexity of O(n) instead of O(n^2). However, for small strings or cases
where efficiency is not a critical concern, the approach you provided is acceptable.
 */
public class E9Two { // Using for loop, indexOf method
    public static void FirstNonRepeat(String s) {
        for (int i = 0; i < s.length(); i++) {

            if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) {
                System.out.println("First non-repeating character is "+ s.charAt(i));
                break;
            }
        }
    }
    public static void main (String[] args) {
        String s = "abracadabra";
        FirstNonRepeat(s);
    }
}
