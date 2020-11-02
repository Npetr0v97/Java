import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {

    private static Scanner scanner = new Scanner(System.in);
    private String playlistName;
    private LinkedList<Song> songs;

    public Playlist(String playlistName) {
        boolean quit = false;
        this.playlistName = playlistName;
        this.songs = new LinkedList<Song>();

        System.out.println("Do you want to add a song?");
        this.addSongToAPlaylist();

        while (!quit) {


        }
        System.out.println("Exiting song adding menu");
    }

    public boolean songAlreadyAdded(String songName) {

        ListIterator<Song> it = songs.listIterator();
        while (it.hasNext()) {

            if (it.next().getSongName() == songName) {

                return true;
            }
        }

        return false;
    }

    public boolean addSongToAPlaylist() {
        boolean isInt;
        int choice;
        int counter = 0;
       // boolean quit = false;
        String songToAdd;


        AlbumLibrary.printAlbumList();
        System.out.println((AlbumLibrary.getAlbums().size()) + ". Exit");

        System.out.println("Choose an album: ");

        isInt = scanner.hasNextInt();
        if (isInt) {

            choice = scanner.nextInt();
        } else {

            choice = -1;
            System.out.println("Invalid choice");
            return false;
        }

        if (choice <= AlbumLibrary.getAlbums().size() && choice >= 1) {

            findSong(AlbumLibrary.getAlbums().get(choice-1));

            return true;
        } else if (choice == AlbumLibrary.getAlbums().size()+1) {

            System.out.println("Exiting album");
            return true;
        } else {

            System.out.println("Not a valid choice");
            return true;
        }

    }

    public Song findSong(Album album) {

        boolean isInt;
        int choice;

        album.printSongList();
        System.out.print("Choose a song: ");
        isInt = scanner.hasNextInt();

        if (isInt) {

            choice = scanner.nextInt();
            scanner.nextLine();
        } else {

            choice = -1;
            System.out.println("Invalid choice");
            return null;
        }

        if (choice <= album.getSongList().size()) {

            return album.getSongList().get(choice);
        } else {

            System.out.println("Invalid choice");
            return null;
        }
    }



}
