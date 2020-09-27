package com.company;

public class Dog extends Animal {

    /*
    наследяването се използва за обединяване на функционалности общи за класовете. Наследяването на практика дава възможност за разбивка и калсифициране
    на данните.
    чрез наследяване наследникът има достъп до всички функции на класа, от който наследява


    използва се extends за наследяване на Клас


    super означава, че се извиква конструктора от класа, от който се наследява
     */

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name,1, 1, size, weight);

        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
}
