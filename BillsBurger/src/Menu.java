import java.util.Scanner;

public class Menu {
    private static boolean isInt;

    private static Scanner data = new Scanner(System.in);
    public static void startMenu() {

        int burgerCode;
        System.out.println("Create a new burger...\nChoose a burger:");
        System.out.println("1. Classic Burger\n2. Healthy Burger\n3. Deluxe Burger");

        isInt=data.hasNextInt();
        if (isInt) {
            burgerCode = data.nextInt();
        } else {

            burgerCode=1;
        }

        switch (burgerCode) {


        }

    }

    public static void

}
