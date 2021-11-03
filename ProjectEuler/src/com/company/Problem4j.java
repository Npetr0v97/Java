package com.company;

import java.util.ArrayList;

public class Problem4j {

    public static void main(String[] args) {

/*        A palindromic number reads the same both ways. The largest palindrome made
            from the product of two 2-digit numbers is 9009 = 91 × 99.

        Find the largest palindrome made from the product of two 3-digit numbers.*/


        int counter=0;
        int answer=0;
        ArrayList<Integer> palindromes = new ArrayList<>();

        boolean flip=true;
        int x = 999,y=999;

        for (int i=999; i>=100; i--) {

            for (int j=999; j>=100; j--) {
                counter++;

//                System.out.println(counter);


                if (isPalindrome(i*j)) {

                    palindromes.add(i * j);

                }
            }
        }
//        while (true) {
//            counter++;
//            System.out.println(x+"*"+y+"="+(x*y));
//            if (isPalindrome(x*y)) {
//
//                palindromes.add(x * y);
//
//            }
//
//
//            if (flip) {
//
//                x--;
//                flip=false;
//            } else {
//
//                y--;
//                flip=true;
//            }
//
//            if (x<100 && y<100) {
//                System.out.println("Out of numbers");
//                break;
//            }
//        }
        if (palindromes.isEmpty()) {

            System.out.println("Empty array");
        } else {
            answer=palindromes.get(0);
            System.out.println(palindromes);

            for (int i=1; i<palindromes.size(); i++) {

                if (answer<palindromes.get(i)) {

                    answer = palindromes.get(i);
                }
            }

            System.out.println("Answer: " + answer);
            System.out.println(counter + " cycles");
        }




    }

    private static boolean isPalindrome (int x) {
        boolean result=true;
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {

            if (x!=0) {
                numbers.add(x%10);
                x=x/10;
            } else {
                break;
            }

        }

        for (int i=0; i<numbers.size()/2; i++) {

            if (numbers.get(i)!=numbers.get(numbers.size()-1-i)){
                result=false;
                break;
            }
        }


        return result;
    }
}
