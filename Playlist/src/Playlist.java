import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {

    private static Scanner scanner = new Scanner(System.in);
    private String playlistName;
    private LinkedList<Song> songs;

    public Playlist(String playlistName) {

        this.playlistName = playlistName;
        this.songs = new LinkedList<Song>();


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

    public void addSongToAPlaylist() {


    }



}
