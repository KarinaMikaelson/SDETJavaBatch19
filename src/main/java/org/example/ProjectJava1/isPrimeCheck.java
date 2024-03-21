package org.example.ProjectJava1;

import java.util.Scanner;

/*
Write a java program to check whether a given number is prime or not?
 */
public class isPrimeCheck {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the number:");
        int number= scan.nextInt();
        if(isPrime(number)) {
            System.out.println(number + " is prime number");
        }
        else{
            System.out.println(number + " is a non-prime number");
        }
    }
    static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
        /*
         Prime numbers - all numbers that are greater than one
         and have only two divisors: 1 and the number itself
        */

    }
}
