package com.company;

import java.util.ArrayList;

public class Problem3{


    public static void main(String[] args) {

       // The prime factors of 13195 are 5, 7, 13 and 29.

       // What is the largest prime factor of the number 600851475143 ?

        ArrayList<Long> primeNumbers = new ArrayList<>();
        primeNumbers.add(2L);
        long value=600851475143L;
        long counter=0;

        for (long x=3; x<=value/2; x+=2) {
            counter++;
            if (x%5==0) {
                continue;
            }
            if (x%997==0){
                System.out.println(x);
            }
            if (value%x==0) {
                boolean isPrime=true;
                for (long l:primeNumbers) {
                    if (l>x/2) {
                        break;
                    }
                    if (x%l==0) {

                        isPrime=false;
                        break;
                    }
                }

                if (isPrime) {
                    primeNumbers.add(x);
                }
            }
        }



        System.out.println("Answer: " +primeNumbers.get(primeNumbers.size()-1));
        System.out.println(counter + " cycles");

    }



}
