import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        boolean quit = false;
        boolean isInt;
        printMenu();

        while (!quit) {
            System.out.print("Choose an option: ");
            isInt = scanner.hasNextInt();

            if (isInt) {

                choice = scanner.nextInt();
            } else {

                choice = -1;
                System.out.println("Invalid choice.");
            }

            switch (choice) {

                case 1:
                    Bank.addBranch();
                    break;
                case 2:
                    Bank.addNewCustomer();
                    break;
                case 3:
                    Bank.addNewTransaction();
                    break;
                case 4:
                    Bank.printListOfCustomers();
                    break;
                case 5:
                    Bank.printTransactionsForCustomer();
                    break;
                default:
                    System.out.println("Exiting bank.");
                    quit = true;
                    break;
            }

        }
    }

    public static void printMenu() {

        System.out.println("Welcome to the bank menu.");
        System.out.println("1. Add a new branch");
        System.out.println("2. Add a new customer to an existing branch");
        System.out.println("3. Add a new transaction to a customer");
        System.out.println("4. Print the list of customer from a branch");
        System.out.println("5. Print all the transactions for a customer");
        System.out.println("6. Quit");
    }
}
