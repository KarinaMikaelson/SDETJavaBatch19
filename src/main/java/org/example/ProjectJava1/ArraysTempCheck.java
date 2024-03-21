package org.example.ProjectJava1;
/*
Create a program that uses an array to store a list of temperatures for a week
and then use a loop to find the highest and lowest temperature for the week.
 */
public class ArraysTempCheck {
    public static void main(String[] args) {

        int [] temperatures = {69, 60, 75, 71, 79, 61, 65};
        int highestTemp = temperatures[0];
        int lowestTemp = temperatures[0];

        for(int i = 1; i < temperatures.length; i++ ){
            if(temperatures[i] > highestTemp){
                highestTemp = temperatures[i];{
            }
            if(temperatures[i] < lowestTemp){
                lowestTemp = temperatures[i];
            }

            }
       }
        System.out.println("Highest temperature for the week is "+highestTemp);
        System.out.println("Lowest temperature for this week is "+lowestTemp);
   }
}

