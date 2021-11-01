package com.example.seriesFunctions;

public class Loading {

    private static int idInit=1;

    private final long number;
    private final int ID;

    public Loading (long number) { //използва се при създаване на нова

        this.number = number;
        this.ID = idInit;
        idInit++;
    }

    public Loading (long number, int ID) {

        this.number = number;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Loading{" +
                "number=" + number +
                ", ID=" + ID +
                '}';
    }

    public static int getIdInit() {
        return idInit;
    }

    public long getNumber() {
        return number;
    }

    public int getID() {
        return ID;
    }
}
