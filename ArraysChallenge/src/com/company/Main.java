package com.company;

public class Main {

    public static void main(String[] args) {


        int[] myIntArray = Array.getIntegers(5);

        Array.printArray(myIntArray);
        System.out.println("------Sorting------------");
        Array.printArray(Array.sortIntegers(myIntArray));
    }
}
