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

        //todo Add Album
    }

    //todo remove an album

    //todo print list of albums

}
