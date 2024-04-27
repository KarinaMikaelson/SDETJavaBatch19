package org.example.project4coding.E6VowelsMethod;
/*
 6. Create a method to count how many vowels are present in a string “documentation”
 */
public class E6VowelsMethod {
    public static int countVowels(String str) {
        // Convert the string to lowercase to simplify counting
        str = str.toLowerCase();

        // Initialize a counter for vowels
        int count = 0;

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a vowel (a, e, i, o, u)
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
            String str = "documentation";
            System.out.println("Number of vowels in 'documentation': " + countVowels(str)); // Output: 5

    }
}

