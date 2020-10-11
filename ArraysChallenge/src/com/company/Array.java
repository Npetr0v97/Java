package com.company;

import java.util.Scanner;

public class Array {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number) {

        System.out.println("Write down " + number + " values.\r");
        int[] array = new int[number];

        for (int i=0; i<array.length; i++) {

            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array) {
        int index=1;
        for (int i=0; i<array.length; i++) {

            System.out.println("Element " + index +": " + array[i]);
            index++;
        }
    }

    public static int[] sortIntegers(int[] array) {
        int currentMax = array[0];
        int lastMax;
        int minValue = array[0];
        int[] sortedArray = new int[array.length];
        int maxIndex = 0;

        for (int i=0; i<array.length; i++) {

            if (minValue > array[i]) {

                minValue = array[i];
            }
        }

        System.out.println("Minimum value: " + minValue);
        for (int i=0; i<sortedArray.length; i++){


            for (int j=0; j<array.length; j++) {

                if (currentMax<array[j]) {

                    currentMax=array[j];
                    maxIndex=j;
                }

            }
            sortedArray[i]=currentMax;
            array[maxIndex]=minValue;
            currentMax=minValue;
        }
        return sortedArray;

    }
}
