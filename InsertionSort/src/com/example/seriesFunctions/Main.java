package com.example.seriesFunctions;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {26,31,41,59,41,58};

      //  System.out.println(Arrays.toString(Algorithms.insertionSort(array)));

        int[] array2 = {10,9,8,7,2,6,5,4,3,2,1};

       // System.out.println(Arrays.toString(Algorithms.insertionSort(array2)));

        int[] array3 = {1,2,3,4,10,2,3,0,22};

        int searchFor = 22;

        System.out.println("Index of " + searchFor + ": " + Algorithms.returnIndexOf(array3, searchFor));

        System.out.println(Arrays.toString(Algorithms.reverseInsertionSort(array3)));


        System.out.println("Index of " + searchFor + ": " + Algorithms.returnIndexOf(array3, searchFor));

        int[] arrayA = {1,1,1};
        int[] arrayB = {1,1,1,0,0};

        System.out.println("===========");
        System.out.println(Arrays.toString(Algorithms.binarySum(arrayA,arrayB)));

        System.out.println("===========");

//        int[] array4 = {4,6,1,3};
        int[] array4 = {10,9,8,7,2,6,5,4,3,2,1};
        System.out.println(Arrays.toString(Algorithms.selectionSort(array4)));

    }
}
