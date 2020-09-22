package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // клас, който е създаден да чете данни


        System.out.println("Enter your year of birth:");

        boolean hasNextInt = scanner.hasNextInt(); //връща true или false спрямо това дали в следващата итерация е въведено число


        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt(); //взема данните като Integer.
            int age = 2020 - yearOfBirth;


            scanner.nextLine(); // използва се, за да се избегне извеждането на (enter) на мястото на name
            // добра практиката е да се използва след всяко използване на nextInt()

            System.out.println("Enter your name: ");
            String name = scanner.nextLine(); //взема данните като String

            if (age >= 0 && age <= 100) {

                System.out.println("Your name is " + name + " and you are " + age + " years old");
            } else {

                System.out.println("Invalid year of birth");
            }
        } else {

            System.out.println("You haven't entered a valid number");
        }

        scanner.close(); //добра практиката е да се затваря обектът, за да се освободи използваната памет
    }
}
