package com.company;

public class Parrot extends Bird{

    public Parrot(String name) {
        super(name);
    }



    @Override
    public String getName() {
        return super.getName();
    }



    @Override
    public void fly() {
        System.out.println("The " + getName() + " is flying");
    }


}
