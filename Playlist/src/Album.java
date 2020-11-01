import java.util.ArrayList;
import java.util.Scanner;

public class Album {

    private static Scanner scanner = new Scanner(System.in);
    private String artist;
    private String albumName;
    private ArrayList<Song> songList;

    public Album(String artist, String albumName) {

        this.albumName = albumName;
        this.artist =artist;
        this.songList = new ArrayList<Song>();
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
}
