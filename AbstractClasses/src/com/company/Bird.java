package com.company;

public abstract class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void eat() {
        System.out.println("The bird " + getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("The bird is breathing");
    }


}
