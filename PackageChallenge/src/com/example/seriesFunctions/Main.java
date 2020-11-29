package com.example.seriesFunctions;

import com.niki.functions.Series;

public class Main {

    public static void main(String[] args) {

        // Create a suitably named package containing a class called Series
        // with the following static methods:
        // nSum(int n) returns the sum of all numbers from 0 to n. The first 10 numbers are:
        // 0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55.
        //
        // factorial(int n) returns the product of all numbers from 1 to n
        // The first 10 factorials are:
        // 0, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800.
        //
        // fibonacci(n) returns the nth Fibonacci number. These are defined as:
        //The first 10 fibonacci numbers are:
        // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.
        //
        // When you have tested your functions, delete the Main class and
        // produce a jar file.
        //
        // Create a new project and add your Series library, then test the
        // three methods in the main() method of your new project.

        System.out.println("Fibonacci sequence--------------");

        for (int i = 1; i <= 10; i++) {

            System.out.println("Fibonacci number " + i + ": " + Series.returnFibonacciNumber(i));
        }
        System.out.println("\nSum--------------");


        for (int i = 1; i <= 10; i++) {

            System.out.println("Sum until " + i + ": " + Series.nSum(i));
        }

        System.out.println("\nFactorial--------------");
        for (int i = 1; i <= 10; i++) {

            System.out.println("Factorial to number " + i + ": " + Series.factorial(i));
        }
    }
}
