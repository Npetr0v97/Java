package com.company;

import java.util.Arrays;

public class IntArray {

    public int[] x= new int[13];
    boolean highest;
    long result;

    public IntArray(int[] x, boolean highest, long result){
        this.x = x;
        this.highest = highest;
        this.result = result;
    }

    public int[] getX() {

        return x;
    }

    public void setX(int[] x) {

        this.x = x;
    }

    public boolean isHighest() {
        return highest;
    }

    public void setHighest(boolean highest) {
        this.highest = highest;
    }

    @Override
    public String toString() {
        String s="";
        for (int i=0; i<x.length; i++) {

            s += x[i];
        }
        s+="  " + result;
        if (highest) {

            s += " HIGHEST";
        }

        return s;
    }

}
