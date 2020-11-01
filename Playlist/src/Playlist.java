import java.util.LinkedList;

public class Playlist {

    private String playlistName;
    private LinkedList<Song> songs;

    public Playlist(String playlistName) {

        this.playlistName = playlistName;
        this.songs = new LinkedList<Song>();
    }


}
