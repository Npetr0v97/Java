package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        int[] normalArray = {1,5,6,7,8,9};

        System.out.println("Non-reversed array: " + Arrays.toString(normalArray));

        reverse(normalArray);

    }

    public static void reverse(int[] array) {

        int[] reversedArray = new int[array.length];
        int arrayIndex=0;

        for (int i=reversedArray.length-1; 0<=i ;i--) {

            reversedArray[i] = array[arrayIndex];
            arrayIndex++;

        }

        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
    }
}
