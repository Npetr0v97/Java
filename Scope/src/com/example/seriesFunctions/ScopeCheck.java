package com.example.seriesFunctions;

public class ScopeCheck {

    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck() {

        System.out.println("Private: " + varOne + "\nPublic: " + publicVar);


    }

    public int getVarOne() {
        return varOne;
    }
    public void timesTwo() {

        int var2 = 2;
        for (int i=0; i<10; i++) {

            System.out.println(i + " times two " + i*var2);
        }
    }

    public class InnerClass {

        public int varThree = 3;

        public InnerClass() {
            System.out.println("InnerClass create, varOne is "+ varOne + " and varThree is " + varThree);
        }

        public void timesTwo() {
            int privateVar =3;
            for (int i=0; i<10; i++) {

                System.out.println(i + " times two " + i*privateVar);
            }
        }
    }


}
