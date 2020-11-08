package com.company;

public class Main {

    public static void main(String[] args) {

        ITelephone timsPhone; //Тук може да бъде DeskPhone, но ако това беше направено, то нямаше да може да изпълним действието на ред 13
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(1234567);
        timsPhone.answer();

        timsPhone = new MobilePhone(125123);
        timsPhone.powerOn();
        timsPhone.callPhone(243454);
        timsPhone.answer();

    }
}
