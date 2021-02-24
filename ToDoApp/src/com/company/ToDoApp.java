package com.company;

import java.util.*;

public class ToDoApp {
    Scanner scanner = new Scanner(System.in);
    private List<Account> accounts = new ArrayList<>();

    public void mainMenu() {

        String password;
        boolean exit=false;
        boolean loginSuccessful=false;
        int foundAccount;
        int primaryChoice; // Used for the main menu
        int secondaryChoice; // Used for the secondary menu

            while (!exit){



                while ()
                System.out.print("Write down your password: ");
                password = scanner.nextLine();

                if (password.equals("Exit!") || password.equals(accounts.get(foundAccount).getPassword()))


            //continue with log in
            // TODO: 18.2.2021 г. Needs to be tested. Can be tested with the temp Account constructor
            // TODO: 18.2.2021 г. Test BTS vs. normal search
            } else {

            System.out.println("There is no registered user the e-mail " + email + "\nWould you like to create a new account?"+
            "\n 1. Yes.\n2. No\nChoose:");
            // TODO: 18.2.2021 г. Choice goes to create new account method
            }
    }

    private int returnAccount(String email) {
        Account enteredAccount = new Account(email, "temp");
        int foundAccount = Collections.binarySearch(accounts,enteredAccount,null);

        return foundAccount;
    }

    private void printMenu() {

        System.out.println("MAIN MENU: \n1. Log in 2. Create a new account");

    }
    // TODO: 18.2.2021 г. Test BTS using a testing algorithm like printing dots
    // TODO: 11.1.2021 г. table of accounts
    // TODO: 11.1.2021 г. implement BST
    // TODO: 11.1.2021 г. Login menu
    // TODO: 27.1.2021 г. validated e-mail with @ than check if is contained in the table

}
