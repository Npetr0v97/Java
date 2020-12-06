package com.example.seriesFunctions;

public class X {

    private int x[];

    public X(int x) {
            this.x = new int[x];
    }

    public void setX(int x) {
        System.out.print((x+1) + " is ->");
        this.x[x] = Main.x.nextInt();
    }

    public int returnLength() {

        return x.length;
    }

    public void printTimesTable() {

        for (int i = 0; i < this.x.length; i++) {

            System.out.println((i+1) + ". " + (x[i]*x[i]));
        }
    }
}
