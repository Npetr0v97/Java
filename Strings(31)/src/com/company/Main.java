package com.company;

public class Main {

    public static void main(String[] args) {
        //#31
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        //String - комбинация от char-ове. Това реално е клас, но се третира като примитивен тип данни
        String myString = "This is a string";
        System.out.println("myString is equal to: " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to: " + myString);
        myString = myString + "\u00A9 2019";
        System.out.println("myString is equal to: " + myString);

        String numberString="250.55";
        numberString = numberString + "49.95";
        //тук няма да се съберат числата, защото са дефинирани като текстово поле
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        //тук отново няма да се съберат числата. Java приоритизира String-а и конвертира myInt към String
        System.out.println("LastString is equal to " + lastString);
        double myDouble = 12.25d;
        lastString = lastString + myDouble;
        System.out.println("LastString is equal to " + lastString);

        


    }
}
