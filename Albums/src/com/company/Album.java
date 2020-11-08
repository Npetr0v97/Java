package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Album {
    private Scanner scanner = new Scanner(System.in);
    private String name;
    private String artist;
    private SongList songlist;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songlist = new SongList();
        boolean quit = false;
        boolean isInt;
        int choice;
        while (!quit) {

            System.out.println("1. Add a song");
            System.out.println("2. Quit");
            System.out.print("Choose: ");
            isInt = scanner.hasNextInt();
            if (isInt) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {

                System.out.println("Invalid choice.");
                choice = -1;
            }

            switch (choice) {

                case 1:
                    songlist.addSong();
                    break;
                default:
                    System.out.println("Exiting...");
                    quit = true;
                    break;
            }
        }
    }

    public void addToSonglist(){

        songlist.addSong();
    }
    public void removeFromSonglist() {
        String name;
        System.out.print("Which song do you want to remove: ");
        name = scanner.nextLine();

        songlist.removeSong(name);
    }

    public String getName() {
        return name;
    }

    //todo print list of songs through album class

    public class SongList{
        ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<Song>();
        }

        private int findSong(String name) {

            for (int i=0; i<songs.size(); i++) {

                if (songs.get(i).getTitle().equals(name)) {

                    return i;
                }
            }

            return -1;
        }

        private void addSong(){
            String name;
            String duration;
            System.out.print("Write down the name of the song you want to add: ");
            name = scanner.nextLine();
            if (findSong(name) == -1) {

                System.out.print("Write down the duration of the song: ");
                duration = scanner.nextLine();

                songs.add(new Song(name,duration));
                System.out.println("Song added.");
            } else {

                System.out.println("Song with the name " + name + " already exists.");
            }
        }

        private void removeSong(String name) {
            if (findSong(name) == -1) {

                System.out.println("Song with the name " + name + " doesn't exist");
            } else {

                songs.remove(findSong(name));
                System.out.println("Song removed.");
            }
        }

        //todo print list of songs

    }
}

