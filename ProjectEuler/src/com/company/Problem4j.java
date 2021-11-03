package com.company;

public class Problem4j {

    public static void main(String[] args) {

/*        A palindromic number reads the same both ways. The largest palindrome made
            from the product of two 2-digit numbers is 9009 = 91 × 99.

        Find the largest palindrome made from the product of two 3-digit numbers.*/


        int min=100*100;
        int max=999*999;
        int counter=0;
        int answer=0;

        for (int i=max; i>=min;i--) {
            counter++;

            if (isPalindrome(i)) {
                answer=i;
                break;
            }
        }

        System.out.println("Answer: " + answer);
        System.out.println(counter + " cycles");


    }

    private static boolean isPalindrome (int x) {

        boolean result=false;

        return result;
    }
}
