package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean quit = false;
        boolean isInt;
        int choice;
        // Modify the playlist challenge so that the Album class uses an inner class.
        // Instead of using an ArrayList to hold its tracks, it will use an inner class called SongList
        // The inner SongList class will use an ArrayList and will provide a method to add a song.
        // It will also provide findSong() methods which will be used by the containing Album class
        // to add songs to the playlist.
        // Neither the Song class or the Main class should be changed.

        printMenu();
        while (!quit){

            System.out.print("Make a choice: ");
            isInt = scanner.hasNextInt();
            if (isInt) {
                choice = scanner.nextInt();
                scanner.nextLine();
                if (choice < 1 || choice > 8) {
                    System.out.println("Invalid choice");
                }
            } else {
                System.out.println("Invalid  choice");
                choice = -1;
            }

            switch (choice) {

                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    break;
            }

        }

        //todo menu
        //todo 1. add an album
        //todo 2. remove an album
        //todo 3. print album list
        //todo 4. add a song to an album
        //todo 5. remove a song from an album
        //todo 6. print songlist of an album
        //todo 7. print menu
        //todo 8. exit
    }

    public static void printMenu() {

        System.out.println("MENU=================");
        System.out.println("1. Add an album");
        System.out.println("2. Remove an album");
        System.out.println("3. Print album list");
        System.out.println("4. Add a song to an album");
        System.out.println("5. Remove a song from an album");
        System.out.println("6. Print an album songlist");
        System.out.println("7. Print menu");
        System.out.println("8. Exit");
    }
}
