package org.example.ProjectJava1;
/*
Create a 2D array or integer type where you will store odd and even numbers.
Develop a program which will identify/print the even numbers only.
 */
public class OddEvenCheck {
    public static void main(String[] args) {

        int [][] array2D = {
                {4, 2, 9, 1},
                {5, 3, 6, 7},
                {2, 8, 3, 6}
        };

         for(int [] row:array2D){
             for(int num : row){
                 if( num % 2 == 0){
                     System.out.print(num+" ");
                 }
             }
         }
    }
}
