package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer,Location>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        locations.put(1, new Location(1, "Road","You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2,"Hill","You are at the top of a hill"));
        locations.put(3, new Location(3,"Building","You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4,"Valley","You are in a valley beside a stream"));
        locations.put(5, new Location(5,"Forest","You are in the forest"));

        // TODO: 23.12.2020 г. Add the directions for all locations

        // TODO: 23.12.2020 г. Do while flow with choices 1. Travel / 2. Quit 

        // TODO: 23.12.2020 г. Display available directions with the locations in brackets
        //Current location: Road
        //1. North (Forest)
        //2. East (Building)
        //3. South (Valley)
        //4. West (Hill)

        int loc = 1;

        while (true) {

            System.out.println(locations.get(loc).getDescription());

            if (loc == 0) {

                break;
            }

            loc = scanner.nextInt();
            if (!locations.containsKey(loc)) {

                System.out.println("You cannot go in the direction");
            }
        }

    }
}
