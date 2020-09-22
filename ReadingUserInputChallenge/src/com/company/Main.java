package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        int sum=0;

        for (int counter=1; counter<=10; counter++) {

            System.out.println("Enter number #" + counter + ":");

            boolean numberIsInt = scanner.hasNextInt();
            if (numberIsInt) {

                number=scanner.nextInt();
                sum+=number;
                if (counter==10) {

                    System.out.println("Total: " + sum);
                } else {

                    System.out.println("Subtotal: " + sum);
                }

            } else {

                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }

        scanner.close();
    }
}
