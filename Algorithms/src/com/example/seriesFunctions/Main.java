package com.example.seriesFunctions;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {5, 2, 4, 6, 1, 3};

        System.out.println(Arrays.toString(intArray));

        int[] sortedArray = InsertionSort.insertionSort(intArray);

        System.out.println(Arrays.toString(sortedArray));
    }
}
