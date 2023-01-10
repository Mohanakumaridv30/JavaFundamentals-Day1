package com.bridgelabz.javafundamentals;

import java.util.Scanner;
public class LeapYear {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the Year : ");
        Long year = s.nextLong();
        if(year!=0)
        {
            if(year%400==0)
                System.out.println(year+" is a leap year");
            else  if(year%100==0)
                System.out.println(year+" is not a leap year");
            else if(year%4==0)
                System.out.println(year+" is a leap year");
            else
                System.out.println(year+" is not a leap year");
        }
        else
            System.out.println("Year zero does not exist ");
    }
}