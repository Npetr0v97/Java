package com.niki.functions;

public class Series {


    public static int nSum(int nthNumber) {
        if (nthNumber < 0) {
            System.out.println("You must enter a positive number.");
            return 0;
        }
        int sum = 0;
        for (int i = nthNumber; i > 0; i--) {

            sum += i;
        }

        return sum;
    }

    public static int factorial(int factorialNumber) {

        if (factorialNumber < 0) {

            System.out.println("You must enter a positive number");
            return 0;
        } else if (factorialNumber == 0) {

            return 1;
        } else {

            int product = 1;

            for (int i = factorialNumber; i >= 1; i--) {

                product *= i;
            }

            return product;
        }
    }

    public static int returnFibonacciNumber(int nthNumber) {

        if (nthNumber < 0) {
            System.out.println("You must enter a positive number.");
            return 0;
        } else if (nthNumber == 0) {

            return 1;
        } else {
            int finalNumber = 1;
            int previousNumber = 0;


            for (int i = 1; i < nthNumber; i++) {
              int temp = finalNumber;
              finalNumber = finalNumber + previousNumber;
              previousNumber = temp;
            }
            return finalNumber;
        }



    }
}
