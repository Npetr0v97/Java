package com.company;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer,Location>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isInt;
        boolean quit = false;
        boolean quitTraveling = false;
        int choice;
        int curLocation = 1;
        int counter;
        String newLocation;

        locations.put(1, new Location(1, "Road","You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2,"Hill","You are at the top of a hill"));
        locations.put(3, new Location(3,"Building","You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4,"Valley","You are in a valley beside a stream"));
        locations.put(5, new Location(5,"Forest","You are in the forest"));

        locations.get(1).addExit("Forest","North");
        locations.get(1).addExit("Building","East");
        locations.get(1).addExit("Valley","South");
        locations.get(1).addExit("Hill","West");

        locations.get(2).addExit("Forest","North");

        locations.get(3).addExit("Road","West");

        locations.get(4).addExit("Road","North");
        locations.get(4).addExit("Hill","West");

        locations.get(5).addExit("Road","South");
        locations.get(5).addExit("Hill","West");

        //TODO         // Change the program to allow players to type full words, or phrases, then move to the
        //        // correct location based upon their input.
        //        // The player should be able to type commands such as "Go West", "run South", or just "East"
        //        // and the program will move to the appropriate location if there is one.  As at present, an
        //        // attempt to move in an invalid direction should print a message and remain in the same place.
        //        //
        //        // Single letter commands (N, W, S, E, Q) should still be available.


        while (!quit) {

            System.out.println("What do you want to do?");
            System.out.println("1. Travel");
            System.out.println("2. Quit");
            System.out.println("--------------");
            System.out.print("Choice: ");
            isInt = scanner.hasNextInt();
            if (isInt) {

                choice = scanner.nextInt();
                scanner.nextLine();
                if (choice < 1 || choice > 2) {
                    System.out.println("Invalid choice.");
                    choice = -1;
                }
            } else {

                System.out.println("Invalid choice.");
                choice=-1;
            }

            System.out.println();

            switch (choice) {

                case 1:
                    quitTraveling = false;
                    while (!quitTraveling) {
                        System.out.println("Current location is " + locations.get(curLocation).getName() + " - " + locations.get(curLocation).getDescription());
                        counter = 1;
                        for (String l : locations.get(curLocation).getExits().keySet()) {

                            System.out.println(counter + ". " + l + " (" + locations.get(curLocation).getExits().get(l) + ")");
                            counter++;
                        }
                        System.out.print("Choose next location or write exit: ");
                        newLocation = scanner.nextLine();
                        if (locations.get(curLocation).getExits().containsKey(newLocation)) {

                            newLocation = newLocation.toLowerCase();
                            switch (newLocation) {

                                case "road":
                                    curLocation = 1;
                                    break;
                                case "hill":
                                    curLocation = 2;
                                    break;
                                case "building":
                                    curLocation = 3;
                                    break;
                                case "valley":
                                    curLocation = 4;
                                    break;
                                case "forest":
                                    curLocation = 5;
                                    break;
                                default:
                                    quitTraveling = true;

                                    break;

                            }
                        } else {

                            System.out.println("Exiting travel");
                            quitTraveling = true;
                        }

                    }

                    break;
                default:
                    quit = true;
                    System.out.println("Exiting program.");
            }
        }



    }
}
