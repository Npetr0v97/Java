package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Account {

    private static Scanner in = new Scanner(System.in);

    private static int id = 1;
    private String name;
    private String password;
    private String email;
    private String timeFormat;
    private boolean notificationsOn;
    private LinkedList<Task> tasks;

    public enum TimeFormat{
        twentyFourHour,
        amAndPm
    }
    //basic constructor
    public Account(String name, String password, String email) {
        this.name = name;
        boolean passwordIsConfirmed = false;
        String confirmedPassword;
        while (!passwordIsConfirmed) {

            System.out.print("Confirm password: ");
            confirmedPassword = in.nextLine();

            if (password.equals(confirmedPassword)) {
                this.password = password;
                passwordIsConfirmed = true;
            } else {

                System.out.println("The passwords don't match");
            }
        }
        this.email = email;
    }
    //constructor with added time format
    public Account(String name, String password, String email, TimeFormat timeFormat) {
        this.name = name;
        boolean passwordIsConfirmed = false;
        String confirmedPassword;
        while (!passwordIsConfirmed) {

            System.out.print("Confirm password: ");
            confirmedPassword = in.nextLine();

            if (password.equals(confirmedPassword)) {
                this.password = password;
                passwordIsConfirmed = true;
            } else {

                System.out.println("The passwords don't match");
            }
        }

        switch (timeFormat) {
            case twentyFourHour:
                this.timeFormat = "24-hour";
                break;
            case amAndPm:
                this.timeFormat = "AM-PM";
                break;
        }

        this.email = email;
    }

    //constructor with added time format and notifications
    public Account(String name, String password, String email, TimeFormat timeFormat, boolean notificationsOn) {
        this.name = name;
        boolean passwordIsConfirmed = false;
        String confirmedPassword;
        while (!passwordIsConfirmed) {

            System.out.print("Confirm password: ");
            confirmedPassword = in.nextLine();

            if (password.equals(confirmedPassword)) {
                this.password = password;
                passwordIsConfirmed = true;
            } else {

                System.out.println("The passwords don't match");
            }
        }

        switch (timeFormat) {
            case twentyFourHour:
                this.timeFormat = "24-hour";
                break;
            case amAndPm:
                this.timeFormat = "AM-PM";
                break;
        }
        this.notificationsOn = notificationsOn;
        this.email = email;
    }

    // TODO: 11.1.2021 г. search tasks
    // TODO: 11.1.2021 г. finish tasks
    // TODO: 11.1.2021 г. visualize all done tasks + all not done tasks
    // TODO: 11.1.2021 г. create tasks + all of its components
    // TODO: 11.1.2021 г. remove tasks
    // TODO: set password if the current password is written down + have confirm new password
    // TODO: set email if current password is chosen + have confirm new email


    @Override
    public int hashCode() {
        return this.email.hashCode() + 123;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", timeFormat='" + timeFormat + '\'' +
                ", notificationsOn=" + notificationsOn +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == (Account) obj) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }



        String objEmail = ((Account) obj).getEmail();
        return this.email.equals(objEmail);
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getTimeFormat() {
        return timeFormat;
    }

    public boolean isNotificationsOn() {
        return notificationsOn;
    }

    public LinkedList<Task> getTasks() {
        return new LinkedList<Task>(tasks);
    }
}
