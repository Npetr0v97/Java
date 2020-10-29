import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Branch> branches = new ArrayList<Branch>();

    public static void addBranch() {

        System.out.print("Write down the name of the branch: ");
        String branchName = scanner.nextLine();

        if (branchPosition(branchName) >= 0) {

            System.out.println("Branch " + branchName + " already exists.");
        } else {
            System.out.print("Write down the first customer name: ");
            String firstCustomerName = scanner.nextLine();
            System.out.print("Write down the first customer's initial amount: ");

            boolean isDouble = scanner.hasNextDouble();
            Double firstCustomerInitialAmount;

            if (isDouble) {

                firstCustomerInitialAmount = scanner.nextDouble();
            } else {
                System.out.println("Invalid value. Initial amount set to 0.0");
                firstCustomerInitialAmount = 0.0;
            }
            scanner.nextLine();

            branches.add(new Branch(branchName,firstCustomerName,firstCustomerInitialAmount));
        }

    }

    private static int branchPosition(String branchName) {

        for (int i = 0; i < branches.size(); i++) {

            if (branches.get(i).getBranchName().equals(branchName)) {

                return i;
            }
        }

        return -1;
    }

    public static void addNewCustomer() {

        System.out.print("Write down the name of the branch where you will add the customer: ");
        String branchName = scanner.nextLine();

        int branchPosition = branchPosition(branchName);
        if (branchPosition >= 0) {

            System.out.print("Write the name of the customer: ");
            String newCustomerName = scanner.nextLine();


            System.out.print("Write his initial amount: ");

            boolean isDouble = scanner.hasNextDouble();
            Double firstCustomerInitialAmount;

            if (isDouble) {

                firstCustomerInitialAmount = scanner.nextDouble();
            } else {
                System.out.println("Invalid value. Initial transaction amount set to 0.0");
                firstCustomerInitialAmount = 0.0;
            }
            scanner.nextLine();

            branches.get(branchPosition).addNewCustomer(newCustomerName, firstCustomerInitialAmount);
        } else {

            System.out.println("Branch " + branchName + " doesn't exist.");
        }

    }

    public static void addNewTransaction() {

        System.out.print("Write down the name of the branch of the customer where you will add the transaction: ");
        String branchName = scanner.nextLine();

        int branchPosition = branchPosition(branchName);
        if (branchPosition >= 0) {

            System.out.print("Write down the customer you want to add a transaction to: ");
            String customerName = scanner.nextLine();
            boolean customerExists = false;
            Double newTransaction;
            boolean isDouble;
            for (int i = 0; i < branches.get(branchPosition).getCustomers().size(); i++) {

                if (branches.get(branchPosition).getCustomers().get(i).getCustomerName().equals(customerName)) {

                    System.out.print("Write down the new transaction for " + customerName + ": ");
                    isDouble = scanner.hasNextDouble();
                    if (isDouble) {

                        newTransaction = scanner.nextDouble();

                    } else {

                        newTransaction = 0.0;
                        System.out.println("Invalid value. New transaction amount set to 0.0");
                    }
                    customerExists = true;
                    scanner.nextLine();
                    branches.get(branchPosition).getCustomers().get(i).addTransaction(newTransaction);
                }

            }

            if (!customerExists) {

                System.out.println("Customer " + customerName + " doesn't exist in branch " + branchName);
            }
        }
    }

    public static void printListOfCustomers() {

        System.out.print("Write down the name of the branch: ");
        String branchName = scanner.nextLine();

        int branchPosition = branchPosition(branchName);
        if (branchPosition >= 0) {

            System.out.println("List of customers for branch " + branchName + "------------");
            for (int i = 0; i < branches.get(branchPosition).getCustomers().size(); i++) {

                System.out.println((i+1) + ". " + branches.get(branchPosition).getCustomers().get(i).getCustomerName());
            }
        } else {

            System.out.println("Branch " + branchName + " doesn't exist.");
        }
    }

    public static void printTransactionsForCustomer() {

        System.out.print("Write down the name of the branch where you will search for the customer: ");
        String branchName = scanner.nextLine();

        int branchPosition = branchPosition(branchName);
        String customerName;
        int customerPosition = -1;
        boolean customerExists = false;
        if (branchPosition >= 0) {

            System.out.print("Write the name of the customer which you want to see the transactions for: ");
            customerName = scanner.nextLine();

            for (int i=0; i < branches.get(branchPosition).getCustomers().size(); i++) {

                if (branches.get(branchPosition).getCustomers().get(i).getCustomerName().equals(customerName)) {

                    customerPosition = i;
                    customerExists = true;
                }
            }

            if (customerExists) {
                System.out.println("List of transactions for " + customerName + "------------");
                for (int i = 0; i < branches.get(branchPosition).getCustomers().get(customerPosition).getTransactions().size(); i++) {

                    System.out.println((i+1) + ". " + branches.get(branchPosition).getCustomers().get(customerPosition).getTransactions().get(i) + "$");
                }
            } else {

                System.out.println("Customer " + customerName + " doesn't exist in the " + branchName + " branch.");
            }

        } else {

            System.out.println("Branch " + branchName + " doesn't exist.");
        }
    }


}
