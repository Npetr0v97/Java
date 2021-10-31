package com.company;

public class Problem1 {

    public static void main(String[] args) {


        //If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
        //Find the sum of all the multiples of 3 or 5 below 1000.

        boolean end=false;
        int n=1;
        int sum=0;
        int counter=0;
        while (!end) {
            counter++;
            int x=n*3;
            int y=n*5;
            System.out.println("x="+x);
            System.out.println("y="+y);
            if (x<1000) {

                if (x%5!=0) {

                    sum+=x;
                }
                if (y<1000) {
                    sum+=y;

                }
                n++;

            } else {

                end=true;
            }

        }

        System.out.println("Answer: " + sum);
        System.out.println(counter + " cycles to complete");
    }
}
