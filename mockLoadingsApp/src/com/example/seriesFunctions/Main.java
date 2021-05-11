package com.example.seriesFunctions;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World");


        String text = "Здравейте. желая да открия товарителница 105102103456.\n" +
                "Също така желая да разпоредя товаритлница 53001234567891.";
        ArrayList<String> loadings = RegexTool.searchLoadings(text);

    }
}
