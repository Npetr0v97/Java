import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int choice;
        boolean isInt;

        System.out.println("Create your contacts list \n-----------------------\nEnter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your phone number: ");
        String myNumber = scanner.nextLine();
        System.out.println("Contacts list created. Hello " + name + " (" + myNumber +")");
        MobilePhone myPhone = new MobilePhone(myNumber, name);

        do {
            printMenu();
            isInt = scanner.hasNextInt();
            if (isInt) {

                choice = scanner.nextInt();
                scanner.nextLine();
                makeChoice(choice,myPhone);

            } else {
                choice = 0;
                scanner.nextLine();
                makeChoice(choice,myPhone);
            }
        } while (choice >= 1 && choice <=4);




    }

    private static void printMenu() {

        System.out.println("------ MENU ------");
        System.out.println("1. Add new Contact");
        System.out.println("2. Update an existing contact");
        System.out.println("3. Remove an existing contact");
        System.out.println("4. Print list of contacts");
        System.out.println("5. Quit");
        System.out.println("\nMake your choice: ");
    }

    private static void makeChoice(int choice, MobilePhone myPhone) {

        switch (choice) {

            case 1:
                mainAddContact(myPhone);
                break;
            case 2:
                mainUpdateContact(myPhone);
                break;
            case 3:
                mainRemoveContact(myPhone);
                break;
            case 4:
                mainPrintList(myPhone);
                break;
            default:
                quit();
                break;
        }
    }

    private static void mainAddContact(MobilePhone myPhone) {
        System.out.print("Write down the name: ");
        String name = scanner.nextLine();
        System.out.print("Write down the phone number: ");
        String phoneNumber = scanner.nextLine();
        myPhone.addContact(name, phoneNumber);
    }

    private static void mainUpdateContact(MobilePhone myPhone) {
        System.out.print("Write down the name you want to update: ");
        String name = scanner.nextLine();
        System.out.print("Write down the new phone number: ");
        String newPhoneNumber = scanner.nextLine();
        myPhone.modifyContact(name,newPhoneNumber);
    }

    private static void mainRemoveContact(MobilePhone myPhone) {
        System.out.print("Write down the name of the contact you want to remove: ");
        String name = scanner.nextLine();
        myPhone.removeContact(name);
    }

    private static void mainPrintList(MobilePhone myPhone) {
        myPhone.printContactList();
    }

    private static void quit() {

        System.out.println("You have exited the app!");
    }
}
