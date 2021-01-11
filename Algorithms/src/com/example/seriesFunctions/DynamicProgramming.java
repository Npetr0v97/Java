package com.example.seriesFunctions;

public class DynamicProgramming {

    public static int fib(int n) {

        if (n < 0) {
            System.out.println("Invalid number");
            return -1;
        } else if (n < 3) {

            return 1;
        } else {
            int number = 0;
            int olderNumber = 1;
            int oldNumber = 1;
            for (int i = 3; i <= n;i ++) {
                number = olderNumber + oldNumber;
                olderNumber = oldNumber;
                oldNumber = number;
            }
            return number;
        }
    }

    public static int fibRec(int n) {

        if (n < 0) {
            System.out.println("Invalid number");
            return -1;
        } else if (n < 3) {

            return 1;
        } else {
            return fibRec(n-1) + fibRec(n-2);
        }
    }
}
