package com.company;

public class Main {

    public static void main(String[] args) {
        //#44
        //няма значение дали всичко ще е на един ред или няколко, java игнорира празните места
        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("this is " + "another" + " still more");
        System.out.println(myVariable);

        int anotherVariable = 5;
        myVariable--;


    }
}
