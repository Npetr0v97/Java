package com.example.seriesFunctions;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {4, 3, 2, 10, 12, 1, 5, 6};

        System.out.println(Arrays.toString(intArray));

        int[] sortedArray = InsertionSort.insertionSort(intArray);

        System.out.println(Arrays.toString(sortedArray));
        System.out.println("Fibonacci sequence");
        for (int i = 1; i <= 10 ; i++) {

            System.out.println("Element " + i + ": " + DynamicProgramming.fibRec(i));
        }

        System.out.println(DynamicProgramming.fib(40));
    }
}
