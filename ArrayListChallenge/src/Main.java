import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        // TODO: 28.10.2020 г. Create a the contact list + print a message to him
        System.out.println("Create your contacts list \n-----------------------\nEnter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your phone number: ");
        String myNumber = scanner.nextLine();
        System.out.println("Contacts list created. Hello " + name + " (" + myNumber +")");
        MobilePhone myPhone = new MobilePhone(myNumber, name);

        int choice;

        // TODO: 28.10.2020 г. Generate Menu with the following options /add/update/removeContact/printList/Quit+Message
    }

    // TODO: 28.10.2020 г. Method: add contact

    // TODO: 28.10.2020 г. Method: update contact

    // TODO: 28.10.2020 г. Method: remove contact

    // TODO: 28.10.2020 г. Method: print list

    // TODO: 28.10.2020 г. Method: Quit + message 
}
