package com.company;

public class Penguin extends Bird{

    public Penguin(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void fly() {
        System.out.println("I am not good at flying");
    }
}
