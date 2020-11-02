import java.util.ArrayList;
import java.util.Scanner;

public class Album {

    private static Scanner scanner = new Scanner(System.in);
    private String artist;
    private String albumName;
    private ArrayList<Song> songList;

    public Album(String artist, String albumName) {
        boolean isInt;
        boolean quit = false;
        int choice;
        String songName;


        this.albumName = albumName;
        this.artist =artist;
        this.songList = new ArrayList<Song>();

        printAlbumMenu();
        isInt = scanner.hasNextInt();
        if (isInt) {

            choice = scanner.nextInt();
            scanner.nextLine();
        } else {

            System.out.println("Invalid choice");
            choice = 3;
        }

        while (!quit) {

            switch (choice) {

                case 1:
                    System.out.print("Write the name of the song: ");
                    songName = scanner.nextLine();
                    addASong(songName);
                    printAlbumMenu();
                    isInt = scanner.hasNextInt();
                    if (isInt) {

                        choice = scanner.nextInt();
                        scanner.nextLine();
                    } else {

                        System.out.println("Invalid choice");
                        choice = 3;
                    }
                    break;
                default:
                    System.out.println("Exiting album menu. ");
                    quit=true;
                    break;
            }
        }
    }

    public boolean songExists(String songName) {

        for (int i=0; i < songList.size(); i++) {

            if (songList.get(i).getSongName().equals(songName)) {

                return true;
            }
        }

        return false;
    }

    public void addASong(String songName) {

        if (songExists(songName)) {

            System.out.println(songName + " already exists");
        } else {
            System.out.print("Write down the song duration: ");
            String songDuration = scanner.nextLine();
            songList.add(new Song(songName, songDuration));
            System.out.println("Song added");
        }

    }

    public void printSongList() {

        if (songList.isEmpty()) {
            System.out.println("The album " + albumName + " is empty");
        } else {
            System.out.println("Songlist of " + albumName + " (" + artist + ")\n");
            for (int i=0; i < songList.size(); i++) {
                System.out.println((i+1) + ". " + songList.get(i).getSongName() + " (" + songList.get(i).getSongDuration() + ")");
            }
        }

    }

    public String getArtist() {
        return artist;
    }

    public String getAlbumName() {
        return albumName;
    }

    public ArrayList<Song> getSongList() {
        return songList;
    }

    private void printAlbumMenu() {

        System.out.println("Do you want to add songs to the album: ");
        System.out.println("1. Yes");
        System.out.println("2. No");
    }
}
