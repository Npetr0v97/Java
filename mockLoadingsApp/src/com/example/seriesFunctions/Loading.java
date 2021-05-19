package com.example.seriesFunctions;

public class Loading {

    private static int idInit=1;

    private final int number;
    private final int ID;

    public Loading (int number) { //използва се при създаване на нова

        this.number = number;
        this.ID = idInit;
        idInit++;
    }

    public Loading (int number, int ID) {

        this.number = number;
        this.ID = ID;
    }
}
