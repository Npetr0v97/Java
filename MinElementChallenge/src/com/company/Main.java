package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    int numberCount;
    boolean isInt;
    System.out.println("How many integers do you want to enter:");
    isInt=scanner.hasNextInt();
    if (isInt) {

        numberCount = scanner.nextInt();
    } else {
        System.out.println("Invalid input. Number of array elements set to 5.");
        numberCount = 5;
    }

    int[] array = readIntegers(numberCount);

        System.out.println("The minimum value of the array is " + findMin(array));

    }

    private static int[] readIntegers(int numberCount) {

        int[] array = new int[numberCount];
        int count;
        boolean isInt;
        System.out.println("\nTime to write down " + numberCount + " elements in you array.\n\n");
        for (int i=0; i<numberCount; i++) {
            count= i+1;
            System.out.println("Write down the value of element " + count + ":");
            isInt = scanner.hasNextInt();
            if (isInt) {

                array[i] = scanner.nextInt();
            } else {

                System.out.println("Invalid value entered. Element set to 0.");
                array[i] = 0;
            }

        }

        return array;
    }

    private static int findMin(int[] array) {

        int minValue = array[0];

        for (int i=0; i<array.length; i++) {

            if (minValue > array[i]) {

                minValue = array[i];
            }
        }

        return minValue;
    }
}
