package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000,
            myMinIntValue = Integer.MIN_VALUE,
            myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum value = " + myMinIntValue);
        System.out.println("Integer Maximum value = " + myMaxIntValue);
        System.out.println("Busten MAX Value = " + (myMaxIntValue + 1)); //Тук се получава overflow(underflow за обратното действие), при което се
        System.out.println("Busten MIN Value = " + (myMinIntValue - 1)); // превъртат данните и числото започва да брои от най-ниското
        int myMaxIntTest = 2_147_483_647; //долната черта може да се използва за прегледност при вписването на големи числа

        //#24
        //short, int, long, double, float, char, byte, boolean - това са примитивни типове
        //wrapper class - всеки примитивен тип има такъв тип клас, който ни позволява да правим различни действия с променливите


        //#25

        byte myMinByteValue = Byte.MIN_VALUE,
             myMaxByteValue = Byte.MAX_VALUE;
        //byte окупира 8 бита или 1 байт информация

        System.out.println("Min Byte Value = " + myMinByteValue);
        System.out.println("Max Byte Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE,
              myMaxShortValue = Short.MAX_VALUE;
        //short окупира 16 бита или 2 байта информация
        //int окумира 32 бита или 4 байта информация

        System.out.println("Min Short Value = " + myMinShortValue);
        System.out.println("Max Short Value = " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE,
             myMaxLongValue = Long.MAX_VALUE,
             longNum = 100;
        //long се използва за дълги числа. В случай че long НЕ СЕ дефинира с "L" то числото се преобразува в integer

        System.out.println("Min Long Value = " + myMinLongValue);
        System.out.println("Max Long Value = " + myMaxLongValue);

        long bigLongLiteralValue = 2_146_231_321_222L;
        //тук имаме правилна дефиниция на long с "L" зад число

        //#26

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);
        // тук следва да изписва грешка, защото Java третира myMinByteValue като int и няма да има съвместимост при записването в byte променлива
        // за да се избегне това се използва т. н. casting, с който казваме на Java да третира данните като определен тип
        // същото важи и за други типове

        short myNewShorValue = (short) (myMinShortValue / 2);

        //#26
        System.out.println("EXAMPLE FROM #26 \n --------------");
        byte exampleByte = 100;
        short exampleShort = 20000;
        int exampleInt = 20000000;
        long exampleLong = 500000L + 10L * (exampleByte + exampleInt + exampleShort);
        //long работи добре с integer и затова няма нужда от casting
        System.out.println("Results = " + exampleLong);
        short shortTotal = (short) (1000 + 10 * exampleByte);


    }
}
