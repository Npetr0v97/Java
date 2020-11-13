package com.company;

import java.sql.SQLOutput;

public class Dog extends Animal {



    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");

    }

    @Override
    public void breathe() {
        System.out.println("Breathing");

    }

    @Override
    public String getName() {
        return super.getName();
    }
}
