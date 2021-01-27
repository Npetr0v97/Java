package com.company;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Account {

    private static Scanner in = new Scanner(System.in);

    private static int id = 1;
    private final int accountId;
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
    public enum SearchType{
        all,
        open,
        done
    }


    //constructor with added time format and notifications
    public Account(String email) {

        boolean passwordIsConfirmed = false;
        String confirmedPassword;
        boolean isInt;
        int formatChoice;

        System.out.print("Write down your username: ");
        this.name = in.nextLine();

        System.out.print("Write down your password: ");
        this.password = in.nextLine();

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

        System.out.print("Time format: \n  1. 24-hour\n  2. AM-PM\n Choose: ");

        isInt = in.hasNextInt();

        if (isInt) {

            formatChoice = in.nextInt();
            switch (formatChoice) {
                case 1:
                    this.timeFormat = "24-hour";
                    break;
                case 2:
                    this.timeFormat = "AM-PM";
                    break;
                default:
                    System.out.println("Format defaulted to 24-hour.");
                    this.timeFormat = "24-hour";
                    break;
            }
        } else {

            System.out.println("Format defaulted to 24-hour.");
            this.timeFormat = "24-hour";
        }

        System.out.print("Notifications: \n  1. On\n  2. Off\n Choose: ");

        isInt = in.hasNextInt();

        if (isInt) {

            formatChoice = in.nextInt();
            switch (formatChoice) {
                case 1:
                    this.notificationsOn = true;
                    break;
                case 2:
                    this.notificationsOn = false;
                    break;
                default:
                    System.out.println("Notifications left on by default.");
                    this.notificationsOn = true;
                    break;
            }
        } else {

            System.out.println("Notifications left on by default.");
            this.notificationsOn = true;
        }


        this.email = email;
        this.tasks = new LinkedList<>();
        this.accountId = id;
        id++;
        //// TODO: 27.1.2021 г. add options to set the rest of the fields
    }

    public void addTask(String name) {

        String dueDate;
        String dueTime;
        String repeat;
        Task.NotificationType notificationType;
        int choice;
        boolean isInt;

        System.out.print("When is the task due: ");
        dueDate = in.nextLine();

        System.out.print("What is the exact due time: ");
        dueTime = in.nextLine();

        System.out.print("Should the task repeat: ");
        repeat = in.nextLine();

        System.out.println("Choose a notification type.\n  1. Vibration\n  2. Sound\n  3. Vibration and sound");
        isInt = in.hasNextInt();


        if (isInt) {
            choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 1:
                    notificationType = Task.NotificationType.vibration;
                    break;
                case 2:
                    notificationType = Task.NotificationType.sound;
                    break;
                case 3:
                    notificationType = Task.NotificationType.vibrationAndSound;
                    break;
                default:
                    System.out.println("Notification type default to vibration and sound");
                    notificationType = Task.NotificationType.vibrationAndSound;
                    break;
            }
        } else {
            System.out.println("Notification type default to vibration and sound");
            notificationType = Task.NotificationType.vibrationAndSound;
        }

        tasks.add(new Task(name, dueDate, dueTime,repeat, notificationType));
    }

    public void searchTask(String name) {



        ListIterator<Task> it = tasks.listIterator();
        boolean foundTask = false;
        String testSubstring;

        while (it.hasNext()) {

            testSubstring = it.next().getName().toLowerCase();

            String[] substringArray = testSubstring.toLowerCase().split(" ");
            for (String s : substringArray) {

                if (s.equals(name)) {

                    System.out.println(it.previous().toString());
                    it.next();
                    foundTask = true;

                }
            }
        }

        if (!foundTask) {

            System.out.println("Task " + name + " not available");
        }
    }

    public void finishTask() {

    }

    public void showTasks(SearchType searchType) {
        //// TODO: 27.1.2021 г. Testing needed
        switch (searchType) {

            case all:
                showFilteredTasks();
                break;
            case open:
                showFilteredTasks(true);
                break;
            case done:
                showFilteredTasks(false);
                break;
        }
    }
    private void showFilteredTasks() {
        int counter = 1;
        ListIterator<Task> it = tasks.listIterator();
        System.out.println("List of Tasks--------------");
        while (it.hasNext()) {
            System.out.println(counter + ". " + it.next().toString());
            counter++;
        }

    }

    private void showFilteredTasks(boolean onlyOpenTasks) {
        int counter = 1;
        ListIterator<Task> it = tasks.listIterator();

        if (onlyOpenTasks) {
            System.out.println("List of Open Tasks--------------");
            while (it.hasNext()) {
                Task currentTask = it.next();
                if (currentTask.isFinished()) {
                    System.out.println(counter + ". " + it.next().toString());
                    counter++;
                }
            }
        } else {
            System.out.println("List of Done Tasks--------------");
            while (it.hasNext()) {
                Task currentTask = it.next();
                if (!currentTask.isFinished()) {
                    System.out.println(counter + ". " + it.next().toString());
                    counter++;
                }
            }
        }
    }



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
                "accountId=" + accountId +
                ", name='" + name + '\'' +
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
