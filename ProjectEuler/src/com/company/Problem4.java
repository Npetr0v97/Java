package com.company;

import java.util.ArrayList;

public class Problem4 {

    public static void main(String[] args) {


        int min=100*100;
        int max = 999*999;
        int counter=0;
        int answer=0;

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("max "+max);

        for (int i = max; i >= min; i--) {

            counter++;
            if (isPalindrome(i)){
                answer=i;
                break;
            }

        }

        System.out.println("Answer: "+ answer);
        System.out.println(counter+ " cycles");


    }

    private static boolean isPalindrome (int x) {
        boolean result=false;


        return result;
    }
}
