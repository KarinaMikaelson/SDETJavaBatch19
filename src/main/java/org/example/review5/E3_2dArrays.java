package org.example.review5;
/*
Output:
10
50
45
20
70 etc
 */
public class E3_2dArrays {
    public static void main(String[] args) {

        int [][] numbers = {
                {10, 20, 30, 40},
                {50, 70, 15, 88},
                {45, 52, 89, 77 }
        };
        for(int i = 0; i < 4; i++){
            for(int j =0; j < 3; j++){
                System.out.println(numbers[j][i]+" ");
            }
        }
    }
}
