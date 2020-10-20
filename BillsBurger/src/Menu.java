import java.util.Scanner;

public class Menu {
    private static boolean isInt;

    private static Scanner data = new Scanner(System.in);
    public void startMenu() {

        int burgerCode;
        System.out.println("Create a new burger...\nChoose a burger:");
        System.out.println("1. Classic Burger\n2. Healthy Burger\n3. Deluxe Burger");

        isInt=data.hasNextInt();
        if (isInt) {
            burgerCode = data.nextInt();
        } else {
            System.out.println("Invalid number. Classic Burger chosen by default.");
            burgerCode=1;
        }

        switch (burgerCode) {
            case 1:
                classicBurgerMenu();
                break;
            case 2:
                healthyBurgerMenu();
                break;
            case 3:
                deluxeBurgerMenu();
                break;
        }

    }

    public void classicBurgerMenu() {
        System.out.println("You chose a Classic Burger!");

        BaseBurger burger=new BaseBurger(breadType(),meatType(),1);

        int choice=1;

        while (choice>0 && choice<=4) {

            System.out.println("Choose additives: \n1. Extra lettuce" +
                    "\n2. Extra tomatoes\n3. Extra carrots" +
                    "\n4. Extra sauce\n5. I don't want more additives");
            isInt=data.hasNextInt();

            if (isInt) {
                choice = data.nextInt();
            } else {
                System.out.println("Invalid choice.");
                choice=0;
            }
            data.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Lettuce added.");
                    burger.addLettuceQuantity();
                    break;
                case 2:
                    System.out.println("Tomatoes added.");
                    burger.addTomatoQuantity();
                    break;
                case 3:
                    System.out.println("Carrots added.");
                    burger.addExtraSauceQuantity();
                    break;
                case 4:
                    System.out.println("Sauce added.");
                    burger.addExtraSauceQuantity();
                    break;
                default:
                    burger.printBurgerStats();
                    break;

            }

        }

    }

    public void healthyBurgerMenu() {
        System.out.println("You choose a Healthy Burger!");

        HealthyBurger healthyBurger=new HealthyBurger(meatType(),1);

        int choice=1;

        while (choice>0 && choice<=6) {

            System.out.println("Choose additives: \n1. Extra lettuce" +
                    "\n2. Extra tomatoes\n3. Extra carrots" +
                    "\n4. Extra sauce\n5. Extra eggs" +
                    "\n6. Extra pickles \n7. I don't want more additives");
            isInt=data.hasNextInt();

            if (isInt) {
                choice = data.nextInt();
            } else {
                System.out.println("Invalid choice.");
                choice=0;
            }
            data.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Lettuce added.");
                    healthyBurger.addLettuceQuantity();
                    break;
                case 2:
                    System.out.println("Tomatoes added.");
                    healthyBurger.addTomatoQuantity();
                    break;
                case 3:
                    System.out.println("Carrots added.");
                    healthyBurger.addExtraSauceQuantity();
                    break;
                case 4:
                    System.out.println("Sauce added.");
                    healthyBurger.addExtraSauceQuantity();
                    break;
                case 5:
                    System.out.println("Fried eggs added.");
                    healthyBurger.addEggsQuantity();
                    break;
                case 6:
                    System.out.println("Pickles added.");
                    healthyBurger.addPicklesQuantity();
                    break;
                default:
                    healthyBurger.printBurgerStats();
                    break;

            }

        }

    }

    public void deluxeBurgerMenu() {
        System.out.println("You chose a Deluxe Burger!");
        DeluxeBurger deluxeBurger=new DeluxeBurger(breadType(),meatType(),1);
        deluxeBurger.printBurgerStats();

    }

    public String breadType(){
        System.out.println("Choose the type of bread: \n1. White\n" +
                "2. Black\n3. Corn");

        int breadCode;
        isInt=data.hasNextInt();
        if (isInt) {
            breadCode = data.nextInt();
        } else {
            System.out.println("Invalid number. White bread chosen by default.");
            breadCode=1;
        }

        switch (breadCode) {

            case 1:
                return "white";

            case 2:
                return "black";

            case 3:
                return "corn";

            default:
                System.out.println("White bread chosen by default");
                return "white";
        }
    }

    public String meatType(){
        System.out.println("Chose the type of meat: \n1. Beef\n" +
                "2. Pork\n3. Chicken");

        int meatCode;
        isInt=data.hasNextInt();
        if (isInt) {
            meatCode = data.nextInt();
        } else {
            System.out.println("Invalid number. White bread chosen by default.");
            meatCode=1;
        }

        switch (meatCode) {

            case 1:
                return "beef";

            case 2:
                return "pork";

            case 3:
                return "chicken";

            default:
                System.out.println("Chicken chosen by default");
                return "chicken";
        }

    }

}

