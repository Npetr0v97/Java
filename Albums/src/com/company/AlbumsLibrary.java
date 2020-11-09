package com.company;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class AlbumsLibrary {

    private static LinkedList<Album> albums = new LinkedList<Album>();
    private static Scanner scanner = new Scanner(System.in);


    public static int findAlbum(String albumName) {
        int position = 0;
        boolean foundMatch = false;
        ListIterator<Album> it = albums.listIterator();

        while (it.hasNext()) {

            if (it.next().getName().equals(albumName)) {

                foundMatch = true;
            }

            position++;
        }

        if (foundMatch) {

            return position;
        }
        return -1;
    }

    public static void addAnAlbum() {
        String name;
        String artist;

        System.out.print("Write down the name of the new album: ");
        name = scanner.nextLine();

        if (findAlbum(name) == -1) {

            System.out.print("Write down the name of the artist: ");
            artist = scanner.nextLine();

            albums.add(new Album(name, artist));
            System.out.println("Album added.");
        } else {

            System.out.println("Album with the name " + name + " already exists.");
        }
    }

    public static void removeAnAlbum() {
        String name;

        System.out.print("Write down the name of the album you want to remove: ");
        name = scanner.nextLine();

        if (findAlbum(name) == -1) {

            System.out.println("No album with the name " + name + " was found.");
        } else {

            albums.remove(findAlbum(name));
            System.out.println(name + " removed from the albums.");
        }
    }

    public void printAlbumList() {
        int counter = 1;
        Album currentAlbum;

        ListIterator<Album> it = albums.listIterator();

        System.out.println("List of albums");
        System.out.println("--------------------------------");

        while (it.hasNext()) {
            currentAlbum = it.next();
            System.out.println(counter + ". " + currentAlbum.getName() + " by " + currentAlbum.getArtist());
            counter++;
        }
    }

}
