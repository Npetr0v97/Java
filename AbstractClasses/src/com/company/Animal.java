package com.company;

public abstract class Animal implements CanFly {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }

    public void fly() {

        System.out.println(getName() + " is flapping its wings");
    }
}
