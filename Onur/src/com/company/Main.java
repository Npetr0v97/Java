package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String fruit;
        String weekday;
        int quantity;
        Scanner scanner = new Scanner(System.in);
        boolean isInt;

        System.out.println("Write down your fruit: ");
        fruit = scanner.nextLine();



        System.out.println("Write down the weekday: ");
        weekday = scanner.nextLine();


        System.out.println("Write down quantity: ");
        isInt = scanner.hasNextInt();
        if (isInt) {

            quantity=scanner.nextInt();
        } else {
            quantity = 1;
        }

        if (!fruit.equals("banana") && !fruit.equals("apple") && !fruit.equals("orange") && !fruit.equals("grapefruit") && !fruit.equals("kiwi")
                && !fruit.equals("pineapple") && !fruit.equals("grapes") || !weekday.equals("Monday") && !weekday.equals("Tuesday")
                && !weekday.equals("Wednesday") && !weekday.equals("Thursday") && !weekday.equals("Friday") && !weekday.equals("Saturday")
                && !weekday.equals("Sunday")) {
            System.out.println("error");
        } else if (weekday.equals("Monday") || weekday.equals("Tuesday")
                || weekday.equals("Wednesday") || weekday.equals("Thursday") || weekday.equals("Friday")){

            switch (fruit) {

                case "banana":
                    System.out.println("Price: " + quantity*2.50);
                    break;
                case "apple":
                    System.out.println("Price: " + quantity*1.20);
                    break;
                case "orange":
                    System.out.println("Price: " + quantity*0.85);
                    break;
                case "grapefruit":
                    System.out.println("Price: " + quantity*1.45);
                    break;
                case "kiwi":
                    System.out.println("Price: " + quantity*2.70);
                    break;
                case "pineapple":
                    System.out.println("Price: " + quantity*5.50);
                    break;
                case "grapes":
                    System.out.println("Price: " + quantity*3.85);
                    break;
            }
        } else {

            switch (fruit) {

                case "banana":
                    System.out.println("Price: " + quantity*2.70);
                    break;
                case "apple":
                    System.out.println("Price: " + quantity*1.25);
                    break;
                case "orange":
                    System.out.println("Price: " + quantity*0.90);
                    break;
                case "grapefruit":
                    System.out.println("Price: " + quantity*1.60);
                    break;
                case "kiwi":
                    System.out.println("Price: " + quantity*3.00);
                    break;
                case "pineapple":
                    System.out.println("Price: " + quantity*5.60);
                    break;
                case "grapes":
                    System.out.println("Price: " + quantity*4.20);
                    break;
            }
        }
    }
}
