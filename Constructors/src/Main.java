import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BankAccount nikolay = new BankAccount();
        Scanner scanner = new Scanner(System.in);

        int accountNumber;
        double balance;
        String customerName;
        String email;
        String phoneNumber;

        double deposit;
        double withdraw;

        BankAccount nikolay2 = new BankAccount(12345, 11111,"Nikolay Petrov","petrov_n@econt.com","0887334020");
        nikolay2.printData();

        BankAccount nikolay3 = new BankAccount();
        nikolay3.printData();

        System.out.println("Enter account number: ");

        boolean isInt = scanner.hasNextInt();

        if (isInt){

            accountNumber = scanner.nextInt();
            nikolay.setAccountNumber(accountNumber);
        } else {

            nikolay.setAccountNumber(-1);
        }
        scanner.nextLine();

        System.out.println("Set balance:");

        boolean isDouble = scanner.hasNextDouble();
        if (isDouble) {

            balance = scanner.nextDouble();
            nikolay.setBalance(balance);
        } else {

            nikolay.setBalance(-1);
        }

        scanner.nextLine();

        System.out.println("Enter your name: ");

        customerName = scanner.nextLine();
        nikolay.setCustomerName(customerName);

        System.out.println("Enter e-mail: ");

        email = scanner.nextLine();
        nikolay.setEmail(email);

        System.out.println("Enter phone number: ");

        phoneNumber = scanner.nextLine();
        nikolay.setPhoneNumber(phoneNumber);



        nikolay.printData();

        System.out.println("Deposit: ");

        isDouble = scanner.hasNextDouble();
        if (isDouble) {

            deposit = scanner.nextDouble();
            nikolay.depositFunds(deposit);
        } else {

            System.out.println("Incorrect format");
        }

        scanner.nextLine();

        System.out.println("Withdraw: ");

        isDouble = scanner.hasNextDouble();
        if (isDouble) {

            withdraw = scanner.nextDouble();
            nikolay.withdrawFunds(withdraw);
        } else {

            System.out.println("Incorrect format");
        }

        scanner.nextLine();

        scanner.close();
    }
}
