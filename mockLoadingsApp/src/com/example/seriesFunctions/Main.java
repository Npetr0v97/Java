package com.example.seriesFunctions;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        System.out.println("Hello World");


        String text = "Здравейте. желая да открия товарителница 105102103456.\n" +
                "Също така желая да разпоредя товаритлница 53001234567891. А 105102103422?";

        System.out.println("Old text: \n" + text);

        RegexToolFinal.addLoading(53001234567891l);
        RegexToolFinal.addLoading(105102103456l);
        RegexToolFinal.addLoading(1051021034512l);
        RegexToolFinal.addLoading(1051021034533l);

        RegexToolFinal.printLoadings();

        RegexToolFinal.searchLoadings(text);

//        ArrayList<String> loadings = RegexTool.searchLoadings(text);

       // System.out.println("New text: \n" + RegexTool.searchLoadings(text));

    }
}
