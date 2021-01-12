package com.company;

import java.util.Objects;

public class Label implements Comparable<Label>{
    private static int counter = 1;
    private final int id;
    private final String name;

    public Label(String name) {
        this.name = name;
        this.id = counter;
        counter++;
    }

    public Label(String name, int id) {
        this.name = name;
        this.id = -1;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Label: " + name + " (ID: #" + id + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Label label = (Label) o;
        return name.equals(label.getName());
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 123;
    }


    @Override
    public int compareTo(Label label) {
        if (this == label) {
            return 0;
        }


        return  this.name.compareTo(label.getName());

    }
}
