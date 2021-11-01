package com.example.seriesFunctions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

//        System.out.println("Hello World");

        boolean exit = false;


        String text = "Здравейте. желая да открия товарителница 105102103456.\n" +
                "Също така желая да разпоредя товаритлница 53001234567891. А 105102103422?";

        System.out.println("Old text: \n" + text);

        RegexToolFinal tool = new RegexToolFinal();

//        tool.addLoading(53001234567891l);
//        tool.addLoading(105102103456l);
//        tool.addLoading(1051021034512l);
//        tool.addLoading(1051021034533l);



        tool.printLoadings();

        tool.searchLoadings(text);

        while (!exit) {
            int choice;
            printMenu();

            try {
                choice = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Exiting program");
                exit = true;
                break;
            }

            switch (choice) {

                case 1:
                    System.out.print("What is the loading number: ");
                    try {
                       tool.addLoading(in.nextLong());
                       tool.cleanUp();
                    } catch (InputMismatchException f) {
                        f.printStackTrace();
                        System.out.println("Invalid number format.");
                    }
                    break;
                case 2:
                    System.out.print("What loading are you searching for: ");
                    try {
                        System.out.println(tool.returnLoadingURL(in.nextLong()));
                    } catch (InputMismatchException f) {
                        f.printStackTrace();
                        System.out.println("Invalid number format.");
                    }
                    break;
                default:
                    System.out.println("Exiting program");
                    exit = true;
            }
        }

        tool.cleanUp();

//        ArrayList<String> loadings = RegexTool.searchLoadings(text);

       // System.out.println("New text: \n" + RegexTool.searchLoadings(text));

    }


    private static void printMenu() {


        System.out.print("MENU---------------\n1. Add a Loading\n2. Receive URL\n3. Exit\nMake a choice: ");

    }
}
