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
                break;
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

    public static void addANewSong() {
        String albumName;
        System.out.print("Write the name of the album where you want to add a song to: ");
        albumName = scanner.nextLine();
        if (findAlbum(albumName) < 0) {

            System.out.println("Album " + albumName + " doesn't exist.");
        } else {
            albums.get(findAlbum(albumName)).addToSonglist();
        }
    }

    public static void removeASong() {
        String albumName;
        System.out.print("Write the name of the album where you want to remove a song from: ");
        albumName = scanner.nextLine();
        if (findAlbum(albumName) < 0) {

            System.out.println("Album " + albumName + " doesn't exist.");
        } else {
            albums.get(findAlbum(albumName)).removeFromSonglist();
        }
    }

    public static void printAlbumSonglist() {
        String albumName;
        System.out.print("Write the name of the album where you want to see the songlist: ");
        albumName = scanner.nextLine();
        if (findAlbum(albumName) < 0) {

            System.out.println("Album " + albumName + " doesn't exist.");
        } else {
            albums.get(findAlbum(albumName)).printSongsInAlbum();
        }
    }

    public static void printAlbumList() {
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
