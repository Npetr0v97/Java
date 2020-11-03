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

            quit = addSongToAPlaylist();
        }
        System.out.println("Exiting song adding menu");
    }

    public boolean songAlreadyAdded(String songName) {

        ListIterator<Song> it = songs.listIterator();
        while (it.hasNext()) {

            if (it.next().getSongName().equals(songName)) {

                System.out.println("Song already exists");
                return true;
            }
        }

        return false;
    }

    public boolean addSongToAPlaylist() {
        boolean isInt;
        int choice;




        AlbumLibrary.printAlbumList();
        System.out.println((AlbumLibrary.getAlbums().size()+1) + ". Exit");

        System.out.println("Choose an album: ");

        isInt = scanner.hasNextInt();
        if (isInt) {

            choice = scanner.nextInt();
        } else {


            System.out.println("Invalid choice");
            return false;
        }

        if (choice <= AlbumLibrary.getAlbums().size() && choice >= 1) {

            if (this.songAlreadyAdded(findSong(AlbumLibrary.getAlbums().get(choice-1)).getSongName())) {

                System.out.println("Song already in playlist");
            } else {

                this.songs.add(findSong(AlbumLibrary.getAlbums().get(choice-1)));
            }


            return false;
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


            System.out.println("Invalid choice");
            return null;
        }

        if (choice <= album.getSongList().size()) {
            System.out.println(album.getSongList().get(choice-1).getSongName() + " added");
            return album.getSongList().get(choice-1);

        } else {

            System.out.println("Invalid choice");
            return null;
        }
    }

    public void printSongsFromPlaylist() {
        int num = 1;
        ListIterator<Song> it = songs.listIterator();
        while (it.hasNext()) {

            System.out.println(num + ". " + it.next().getSongName() + " (" + it.next().getSongDuration() + ")");
        }
    }

    public String getPlaylistName() {


        return playlistName;
    }

    public LinkedList<Song> getSongs() {
        return songs;
    }

}
