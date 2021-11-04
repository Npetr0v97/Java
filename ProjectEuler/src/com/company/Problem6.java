package com.company;

public class Problem6 {

    public static void main(String[] args) {


        int answer=0;

        int sqSum=0,sumSq=0;

        for (int i=10; i<=100; i++) {

            sumSq+=i*i;
            sqSum+=i;

            System.out.println("sumSq="+sumSq);
            System.out.println("sqSum="+sqSum);
        }

        answer=sqSum*sqSum-sumSq;

        System.out.println(answer);
    }
}
