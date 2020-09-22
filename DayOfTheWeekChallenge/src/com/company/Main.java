package com.company;

public class Main {

    public static void main(String[] args) {

        int day = 0;

        printDayOfTheWeek(0);
        printDayOfTheWeekIfElse(0);
        System.out.println("--------------");
        printDayOfTheWeek(1);
        printDayOfTheWeekIfElse(1);
        System.out.println("--------------");
        printDayOfTheWeek(2);
        printDayOfTheWeekIfElse(2);
        System.out.println("--------------");
        printDayOfTheWeek(3);
        printDayOfTheWeekIfElse(3);
        System.out.println("--------------");
        printDayOfTheWeek(4);
        printDayOfTheWeekIfElse(4);
        System.out.println("--------------");
        printDayOfTheWeek(5);
        printDayOfTheWeekIfElse(5);
        System.out.println("--------------");
        printDayOfTheWeek(6);
        printDayOfTheWeekIfElse(6);
        System.out.println("--------------");
        printDayOfTheWeek(7);
        printDayOfTheWeekIfElse(7);
        System.out.println("--------------");
        }

    public static void printDayOfTheWeekIfElse(int day) {

        if (day == 0) {

            System.out.println("Its Monday");
        } else if (day == 1) {

            System.out.println("Its Tuesday");
        } else if (day == 2) {

            System.out.println("Its Wednesday");
        } else if (day == 3) {

            System.out.println("Its Thursday");
        }  else if (day == 4) {

            System.out.println("Its Friday");
        } else if (day == 5) {

            System.out.println("Its Saturday");
        } else if (day == 6) {

            System.out.println("Its Sunday");
        } else {

            System.out.println("Invalid day");
        }
    }


    public static void printDayOfTheWeek(int day) {

        switch (day) {

            case 0:

                System.out.println("Its Monday");
                break;

            case 1:

                System.out.println("Its Tuesday");
                break;

            case 2:

                System.out.println("Its Wednesday");
                break;

            case 3:

                System.out.println("Its Thursday");
                break;

            case 4:

                System.out.println("Its Friday");
                break;

            case 5:

                System.out.println("Its Saturday");
                break;

            case 6:

                System.out.println("Its Sunday");
                break;

            default:

                System.out.println("Invalid day");
                break;
        }
    }
}
