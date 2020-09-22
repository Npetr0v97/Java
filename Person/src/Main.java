import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Person Nikolay = new Person();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your first Name: ");
        String firstName = scanner.nextLine();

        System.out.println("Write your last Name: ");
        String lastName = scanner.nextLine();

        System.out.println("Write your age: ");
        boolean isInt = scanner.hasNextInt();
        int age;
        if (isInt) {

            age = scanner.nextInt();
        } else {

            age = 0;
        }

        Nikolay.setFirstName("Nikolay");
        Nikolay.setLastName("Petrov");
        Nikolay.setAge(23);

        if (Nikolay.isTeen()) {

            System.out.println("My name is " + Nikolay.getFullName() + " and I am " + Nikolay.getAge() + " years old (a teen).");
        } else {

            System.out.println("My name is " + Nikolay.getFullName() + " and I am " + Nikolay.getAge() + " years old (not a teen).");
        }
    }
}
