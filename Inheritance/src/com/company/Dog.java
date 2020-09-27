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

    public void chew() {

        System.out.println("Dog Chews");
    }


    //@Override е индикатор, че правим презаписване на метод от класа, от който се наследява
    //super.eat се връща към функцията от основния клас и извиква метода от там.
    @Override
    public void eat() {

        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    private void moveLegs(int speed){

        System.out.println("moveLegs. called");
    }

    @Override
    public void move(int speed) {

        System.out.println("Dog.move called");
        moveLegs(speed);
        super.move(speed);
    }

    public void walk() {

        System.out.println("Dog.walk() called");
        move(5);
    }

    public void run() {

        System.out.println("Dog.run() run");
        move(10);
    }
}
