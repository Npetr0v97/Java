package com.example.seriesFunctions;

public class ScopeCheck {

    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck() {

        System.out.println("Private: " +privateVar + "\n Public: " + publicVar);


    }

    public int getPrivateVar() {
        return privateVar;
    }
    public void timesTwo() {

        int privateVar = 2;
        for (int i=0; i<10; i++) {

            System.out.println(i + " times two " + i*privateVar);
        }
    }

    public class InnerClass {

        public int privateVar = 3;

        public InnerClass() {
            System.out.println("InnerClass created " + privateVar);
        }

        public void timesTwo() {

            int privateVar =3;
            for (int i=0; i<10; i++) {

                System.out.println(i + " times two " + i*privateVar);
            }
        }
    }


}
