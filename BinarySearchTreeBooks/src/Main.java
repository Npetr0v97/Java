import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);
    private static boolean isInt;
    private static String temp;

    public static void main(String[] args) {


/*        String data = "ABC DEF GHI JKL MNO PQRST UVW XYZ";
        String[] dataArray = data.split(" ");
        System.out.println(Arrays.toString(dataArray));*/

        boolean quit = false;
        int choice;
        System.out.print("Write the name of the book collection: ");
        BinarySearchTree tree = new BinarySearchTree(scanner.nextLine());
        printMenu();
        while (!quit) {

            System.out.print("Make a choice: ");
            isInt = scanner.hasNextInt();
            if (isInt) {

                choice = scanner.nextInt();
                scanner.nextLine();

                if (choice < 1 || choice > 4) {

                    System.out.println("Invalid choice.");
                }
            } else {

                System.out.println("Invalid choice.");
                choice = -1;
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter the name of the book you want to add: ");
                    temp = scanner.nextLine();
                    tree.insertItem(temp);

                    break;
                case 2:
                    System.out.print("Enter the name of the book you want to remove: ");
                    temp = scanner.nextLine();
                    tree.deleteBook(temp);
                    break;
                case 3:
                    System.out.println("Books in collection " + tree.getName() + " ================");
                    tree.goThroughTree();
                    break;
                case 4:
                    System.out.print("Write the name of the book you want to replace: ");
                    temp = scanner.nextLine();
                    tree.replaceBook(temp);
                case 5:
                    printMenu();
                    break;
                default:
                    System.out.println("Exiting program.");
                    quit = true;
                    break;
            }

        }

    }

    private static void printMenu() {

        System.out.println("1. Add book to collection");
        System.out.println("2. Remove a book from collection");
        System.out.println("3. Show books in the collection");
        System.out.println("4. Change book title");
        System.out.println("5. Print menu");
        System.out.println("6. Quit");
    }
}
