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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Label label = (Label) o;
        return name.equals(label.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name) + 123;
    }

    @Override
    public int compareTo(Label label) {
        if (this.name.equals(label.getName())) {
            return 0;
        }

        return  this.name.compareTo(label.getName());

    }
}
