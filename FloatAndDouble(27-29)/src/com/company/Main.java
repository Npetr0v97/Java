package com.company;

public class Main {

    public static void main(String[] args) {
	    //#27
        //float и double се използват за десетични числа
        //float окупира 32 бита или 4 байта, а double окупира 64 бита или 8 байта
        float myMinFloatValue = Float.MIN_VALUE,
              myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value: " + myMinFloatValue);
        System.out.println("Float maximum value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE,
               myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value: " + myMinDoubleValue);
        System.out.println("Double maximum value: " + myMaxDoubleValue);

        //#28
        int myIntValue = 5 / 3;
        //при делене int закръгля на по-ниското число
        float myFloatValue = (float) 5 / 3;
        float myFloatValue2 = 5f;
        //нужно е задължително да се записва f след числото иначе по подразбиране ще се записва като double. Друг вариант е да се използва casting
        double myDoubleValue = 5.00 / 3.00 ;
        //при double не е задължително да се пише d зад числата
        //въпреки че double заема двойно повече пространство, double се използва по-често, защото по-бързо се обработват данните, а и повечето
        //Java библиотеки са предназначени за double


        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue =" + myFloatValue);
        System.out.println("MyDoubleValue =" + myDoubleValue);

        //#29
        System.out.println("#29 \n ------------");
        double pounds = 50d;
        double kilograms = pounds * 0.45359237d;

        System.out.println(pounds + " pounds are " + kilograms + " kilograms");
        double pi=3.1415927d;
        double anotherNumber=3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
        //при нужда от точно пресмятане на стойности(примерно при финанси) се използват класове като BigDecimal, които решават този проблем

    }
}
