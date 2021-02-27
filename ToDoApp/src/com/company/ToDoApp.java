package com.company;

import java.util.*;

public class ToDoApp {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Account> accounts = new ArrayList<>();

    public static void mainMenu() {

        String password;
        boolean exit=false;
        boolean loginSuccessful=false;
        int foundAccount;
        boolean isInt;
        int primaryChoice; // Used for the main menu
        int secondaryChoice; // Used for the secondary menu

            while (!exit) {

                printMenu();
                isInt = scanner.hasNextInt();

                if (isInt) {
                    primaryChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (primaryChoice < 1 || primaryChoice > 4) {
                        System.out.println("Invalid choice.");
                        primaryChoice = 4;
                    }

                } else {

                    System.out.println("Invalid choice.");
                    primaryChoice = 4;
                }

                switch (primaryChoice) {

                    case 1:
                        logIn();
                        break;
                    case 2:
                        createAccount();
                        break;
                    case 3:
                        printAccountsList();
                    case 4:
                        System.out.println("Exiting program.");
                        exit = true;
                        break;

                }
            }
    }

    private static void logIn() {

        boolean loggedIn = false;
        int attemptsAccount = 1;
        int attemptsPassword = 1;
        String email;

        do {

            System.out.print("Write down your e-mail: ");
            email = scanner.nextLine();
            int elementIndex = returnAccount(email);
            if (elementIndex >=0) {
                Account currentAccount =  accounts.get(elementIndex);
                String password;
                do {
                    System.out.print("Write down your password: ");
                    password = scanner.nextLine();

                    if ()
                } while (attemptsPassword<=3);
            }

            attemptsAccount++;

        } while (attemptsAccount<=3);


    }

    private static void createAccount() {


    }

    private static void printAccountsList(){


    }

    private static int returnAccount(String email) {
        Account enteredAccount = new Account(email, "temp");
        int foundAccount = Collections.binarySearch(accounts,enteredAccount,null);

        return foundAccount;
    }

    private static void printMenu() {

        System.out.println("MAIN MENU: \n1. Log in 2. Create a new account \n3. List of all accounts \n4. Exit App");

    }
    // TODO: 18.2.2021 г. Test BTS using a testing algorithm like printing dots
    // TODO: 11.1.2021 г. table of accounts
    // TODO: 11.1.2021 г. implement BST
    // TODO: 11.1.2021 г. Login menu
    // TODO: 27.1.2021 г. validated e-mail with @ than check if is contained in the table

}
