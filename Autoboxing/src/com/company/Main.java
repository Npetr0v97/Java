package com.company;

import java.util.ArrayList;

class IntClass {

    private int myValue;

    public IntClass(int myValue) {

        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	    String[] strArray = new String[10];
	    int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Nikolay");

//        ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();

        intClassArrayList.add(new IntClass(54));

        ArrayList<Integer>  intAutoboxingArrayList = new ArrayList<Integer>();

        for (int i=0; i<=10; i++) {

            intAutoboxingArrayList.add(Integer.valueOf(i));
        }

        for (int i=0; i<=10; i++) {

            System.out.println(intAutoboxingArrayList.get(i).intValue());
        }

        Integer myIntValue = 56; //Същото като new Integer(56)
        int myInt = myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();

        for (double dbl=0.0; dbl <= 10.0; dbl += 0.5) {

            myDoubleValues.add(Double.valueOf(dbl));
        }

        for (int i=0; i < myDoubleValues.size(); i++) {


            System.out.println(myDoubleValues.get(i).doubleValue());
        }

    }
}
