package com.example.seriesFunctions;

import java.util.Scanner;

public class Main {

    public static Scanner x = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.print("How much numbers should there be in the array: ");
        X x = new X(Main.x.nextInt());
        for (int i=0; i < x.returnLength(); i++) {

            x.setX(i);

            System.out.println("");
        }
        System.out.println("******************");
        x.printTimesTable();
        // Write a small program to read an integer from the keyboard
        // (using Scanner) and print out the times table for that number.
        // The table should run from 1 to 12.
        //
        // You are allowed to use one variable called scanner for your
        // Scanner instance. You can use as many other variables as you
        // need, but they must must all be called x. That includes any
        // class instances and loop control variables that you may decide
        // to use.
        //
        // If you use a class, the class can be called X (capital), but
        // any instances of it must be called x (lower case).
        //
        // Any methods you create must also be called x.
        //
        // Optional Extra:
        // Change your program so that ALL variables (including the scanner
        // instance) are called x.
    }
}
