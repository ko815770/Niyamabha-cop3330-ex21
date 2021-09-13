package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class App {
    public static void main(String[] args) {
        int month;
        String mon = "";
        System.out.println("Please enter the number of the month");
        Scanner input = new Scanner(System.in);
        month = input.nextInt();
        if (month > 0 && month < 13)
        {
            switch (month)
            {
                case 1:
                    mon = "January";
                    break;
                case 2:
                    mon = "February";
                    break;
                case 3:
                    mon = "March";
                    break;
                case 4:
                    mon = "April";
                    break;
                case 5:
                    mon = "May";
                    break;
                case 6:
                    mon = "June";
                    break;
                case 7:
                    mon = "July";
                    break;
                case 8:
                    mon = "August";
                    break;
                case 9:
                    mon = "September";
                    break;
                case 10:
                    mon = "October";
                    break;
                case 11:
                    mon = "November";
                    break;
                case 12:
                    mon = "December";
                    break;
            }
            System.out.println("The name of the month is " + mon + ".");
        }
        else
        {
            System.out.println("Please enter a number between 1 and 12");
        }
    }
}