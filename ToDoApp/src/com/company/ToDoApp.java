package com.company;

import java.util.*;

public class ToDoApp {

    private List<Account> accounts = new ArrayList<>();

    public void logInAccount(String email) {
        Account enteredAccount = new Account(email, "temp");
        int foundAccount = Collections.binarySearch(accounts,enteredAccount,null);
        if (foundAccount >= 0) {
            System.out.print(". ");
            //continue with log in
            //// TODO: 18.2.2021 г. Needs to be tested. Can be tested with the temp Account constructor
        } else {

            System.out.println("There is no registered user the e-mail " + email + "\nWould you like to create a new account?"+
            "\n 1. Yes.\n2. No\nChoose:");
            // TODO: 18.2.2021 г. Choice goes to create new account method
        }
    }
    // TODO: 18.2.2021 г. Test BTS using a testing algorithm like printing dots
    // TODO: 11.1.2021 г. table of accounts
    // TODO: 11.1.2021 г. implement BST
    // TODO: 11.1.2021 г. Login menu
    // TODO: 27.1.2021 г. validated e-mail with @ than check if is contained in the table

}
