package com.company;

import java.util.*;

public class ToDoApp {
    private static Scanner scanner = new Scanner(System.in);
    public static List<Account> accounts = new ArrayList<>();

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
                        Collections.sort(ToDoApp.accounts);
                        break;
                    case 3:
                        printAccountsList();
                        break;
                    case 4:
                        System.out.println("Exiting program.");
                        exit = true;
                        break;

                }
            }
    }

    private static void logIn() {


        int attemptsAccount = 1;
        int attemptsPassword = 1;
        String email;
        boolean exit = false;
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

                    if (currentAccount.getPassword().equals(password)) {

                        System.out.println("Welcome back " + currentAccount.getName());

                        accountMenu(currentAccount);

                        exit=true;
                        System.out.println("You have successfully logged out.");
                    } else {
                        System.out.println("Wrong password.");
                        attemptsPassword++;
                    }

                } while (attemptsPassword<=3 && !exit);


            } else {

                System.out.println("An account with the e-mail " + email + " doesn't exist.");
                attemptsAccount++;

            }

        } while (attemptsAccount<=3 && !exit);

        if (attemptsPassword == 3) {

            System.out.println("You have failed to log in because of trying to use 3 incorrect passwords.");
        } else if (attemptsAccount == 3) {

            System.out.println("You have failed to log in because of trying to use 3 e-mails that don't exist.");
        }

    }

    private static void accountMenu(Account account) {
        int choice;
        boolean isInt;
        boolean exit = false;
        String taskName;

        while (!exit) {
            printAccountMenu();

            isInt=scanner.hasNextInt();

            if (isInt) {

                choice = scanner.nextInt();
                scanner.nextLine();

                if (choice < 0 || choice > 10) {

                    System.out.println("Invalid choice.");
                    choice = 10;
                }
            } else {

                System.out.println("Invalid choice.");
                choice = 10;
            }

            switch (choice) {

                case 1:
                    System.out.print("Write down the name of the task: ");
                    taskName = scanner.nextLine();
                    account.addTask(taskName);
                    break;
                case 2:
                    System.out.print("Which task do you want to complete: ");
                    taskName = scanner.nextLine();
                    account.finishTask(taskName);
                    break;
                case 3:
                    account.addLabelToTask();
                    break;
                case 4:
                    account.removeLabelFromTask();
                    break;
                case 5:
                    System.out.print("Which task do you want to remove: ");
                    taskName = scanner.nextLine();
                    account.removeTask(taskName);
                    break;
                case 6:
                    System.out.print("What do you want to search for: ");
                    taskName = scanner.nextLine();
                    account.searchTask(taskName);
                    break;
                case 7:
                    System.out.println(account);
                    break;
                case 8:
                    chooseTaskToShow(account);
                    break;
                case 9:
                    System.out.print("Write down current password: ");
                    String password = scanner.nextLine();
                    account.setNewEmail(password);
                    break;
                default:
                    System.out.println("Logging out");
                    exit=true;
                    break;

            }
        }

    }

    private static void chooseTaskToShow(Account account) {
        int choice;
        boolean isInt;

        System.out.print("Which task do you want to show: \n1. All \n2. Done \n3. Open \nChoose: ");
        isInt=scanner.hasNextInt();

        if (isInt) {

            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice < 0 || choice > 3) {

                System.out.println("Invalid choice. All task are printed by default.");
                choice = 1;
            }
        } else {

            System.out.println("Invalid choice. All task are printed by default.");
            choice = 1;
        }

        switch (choice) {

            case 1:
                account.showTasks(Account.SearchType.all);
                break;
            case 2:
                account.showTasks(Account.SearchType.open);
                break;
            default:
                account.showTasks(Account.SearchType.done);
                break;
        }

    }

    private static void createAccount() {

        System.out.print("Write down your e-mail:");
        String email = scanner.nextLine();

        accounts.add(new Account(email));
    }

    private static void printAccountsList(){
        int passwordAttempts = 1;


        while (passwordAttempts<=3) {
            System.out.print("Write down the admin's password: ");
            String adminPassword = scanner.nextLine();

            if (adminPassword.equals("admin123")) {

                System.out.println("Authentication successful.");
                int counter = 1;
                System.out.println("Accounts list----------------");
                for (Account a :accounts) {

                    System.out.println(counter+ ". " + a.toString());
                    counter++;
                }

                break;

            } else {
                System.out.println("Authentication unsuccessful. ");
                passwordAttempts++;
            }
        }

        if (passwordAttempts > 3) {

            System.out.println("You will return to the main menu due to 3 unsuccessful authentications.");
        }
    }

    private static int returnAccount(String email) {
        Account enteredAccount = new Account(email, "temp");
        int foundAccount = Collections.binarySearch(accounts,enteredAccount,null);

        return foundAccount;
    }

    private static void printMenu() {

        System.out.print("MAIN MENU: \n1. Log in \n2. Create a new account \n3. List of all accounts \n4. Exit App \nMake a choice: ");

    }

    private static void printAccountMenu(){

        System.out.print("ACCOUNT MENU: \n1. Add a task \n2. Complete a task" +
                "\n3. Add a label to an existing task \n4. Remove a label from an existing task" +
                "\n5. Remove a task \n6. Search for a task \n7. Account info \n8. Show tasks" +
                "\n9. Change e-mail address \n10. Exit \nChoose: ");
    }


}