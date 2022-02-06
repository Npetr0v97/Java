package com.company;

import java.util.ArrayList;

public class Problem9 {


    /*
    *
    *
    *A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

    a2 + b2 = c2
    For example, 32 + 42 = 9 + 16 = 25 = 52.

    There exists exactly one Pythagorean triplet for which a + b + c = 1000.
    Find the product abc.
    *
    * */

    public static void main(String[] args) {





        ArrayList<Integer> numbers = new ArrayList<>();

        double result=1000;
        long answer=0;

        boolean end=false;

        for (double i=1; i<result; i++) {

            for (double j=1; j<result; j++) {

                double c=Math.sqrt(i*i+j*j);
                if (c%1==0.0) {
                    if (i!=j){
                        if (i+j+c==1000){
                            System.out.println("a: "+i +"; b: "+j+ "; c: " +c);
                            answer=(long)i*(long)j*(long)c;
                            end=true;
                            break;
                        }

                    }
                }
            }

            if (end) {

                break;
            }
        }

        System.out.println("Asnwer: "+answer);


    }
}
