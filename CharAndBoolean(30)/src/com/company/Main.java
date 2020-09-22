package com.company;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';
        char myUnicodeChar = '\u009C';
        //#30
        //char - окопира 16 бита или 2 байта. Не е 1 байт, защото позволява да се използват Unicode символи,
        //които могат да се използват за други езици
        //char може да се дефинира с Unicode като се комбинира <наклонена черта>u<Unicode>
        //link към Unicode таблицата: https://unicode-table.com/en/#009C

        System.out.println("My Char: " + myChar);
        System.out.println("My Unicode: " + myUnicodeChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
        //boolean - true/false

        
    }
}
