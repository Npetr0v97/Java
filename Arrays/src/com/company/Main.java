package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10}; //това попълване може да се направи само при инициализирането на масива

        myIntArray[0] = 45;
        myIntArray[5] = 50;

        int[] myIntArray2 = new int[10]; //така масово се инициализират масивите

        double[] myDoubleArray = new double[10];
        //System.out.println(myIntArray[5]);
        //System.out.println(myIntArray[7]);
        //System.out.println(myIntArray[8]);


        //printArray(myIntArray);


        //----------------------------------


        double[] sumArray = getDoubles(5);
        for (int i=0;i<sumArray.length; i++) {

            System.out.println("Element "+i+", typed value was " + sumArray[i]);
        }

        System.out.println("Average: " + getAverage(sumArray));

    }

    public static double[] getDoubles(int number) {

        System.out.println("Enter "+number+" integer values. \r");
        double[] values = new double[number];

        for (int i=0; i<values.length; i++) {

            values[i]=scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array) {

        for (int i=0; i<array.length;i++) {

            System.out.println(array[i]);
        }
    }

    public static double getAverage(double[] array) {

        double sum = 0;
        for (int i=0; i<array.length; i++) {
            sum += array[i];

        }

        return sum / (double)array.length;
    }
}
