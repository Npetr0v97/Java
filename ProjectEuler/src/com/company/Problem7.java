package com.company;

import java.util.ArrayList;

public class Problem7 {

    /*    By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

    What is the 10 001st prime number?
    */
    public static void main(String[] args) {

        ArrayList<Integer> primeNumbers = new ArrayList<>();
        primeNumbers.add(2);
        int cycles=1;
        int counter=1;
        int currentNumber=3;
        int excess=0;

        while (true) {
            boolean isPrime=true;

            for (Integer primeNumber: primeNumbers) {

                if (currentNumber%primeNumber==0) {
                    isPrime=false;
                    break;
                }
            }

            if (isPrime) {
                primeNumbers.add(currentNumber);
                counter++;
//                currentNumber= currentNumber + (currentNumber-primeNumbers.get(primeNumbers.size()-2));
            }

            if (counter==10001) {
                break;
            }
            currentNumber+=2;
            cycles++;
//            System.out.println(cycles);
        }

        System.out.println("Answer: " +primeNumbers.get(primeNumbers.size()-1)+"/Cycles: "+ cycles);
        System.out.println(primeNumbers.get(primeNumbers.size()-1));
        System.out.println(primeNumbers.get(primeNumbers.size()-2));
        System.out.println(primeNumbers.get(primeNumbers.size()-3));
        System.out.println(primeNumbers.get(primeNumbers.size()-4));
        System.out.println(primeNumbers.get(primeNumbers.size()-5));
        System.out.println(primeNumbers.get(primeNumbers.size()-6));
        System.out.println(primeNumbers.get(primeNumbers.size()-7));
        System.out.println(primeNumbers.get(primeNumbers.size()-8));




    }
}
