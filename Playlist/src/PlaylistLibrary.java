import java.util.ArrayList;
import java.util.Scanner;

public class PlaylistLibrary {


    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Playlist> playlists = new ArrayList<Playlist>();

/*
    public PlaylistLibrary() {

        this.playlists =
        System.out.println("Playlist Library initialized");
    }*/

    public static boolean playlistExists(String playlistName) {

        for (int i=0; i < playlists.size(); i++) {

            if (playlists.get(i).getPlaylistName().equals(playlistName)){
                return true;
            }

        }
        return false;
    }

    public static void addPlaylist() {
        String playlistName;

        System.out.println("Write the name of the playlist: ");
        playlistName = scanner.nextLine();
        if (playlistExists(playlistName)) {

            System.out.println("Playlist " + playlistName + " already exists.");
        } else {

            playlists.add(new Playlist(playlistName));
        }
    }

    public static void addSongToPlaylist() {
        String playlistName;

        System.out.println("Choose a playlist to add the songs to: ");
        playlistName = scanner.nextLine();
        if (!playlistExists(playlistName)) {

            System.out.println("Playlist " + playlistName + " doesn't exist");
        } else {

            for (int i=0; i<playlists.size(); i++) {

                if (playlists.get(i).getPlaylistName().equals(playlistName)) {

                    playlists.get(i).addSongToAPlaylist();
                }
            }
        }
    }

    public static void printPlaylists() {

        for (int i=0; i < playlists.size(); i++) {

            System.out.println((i+1) + ". " + playlists.get(i).getPlaylistName());
        }
    }

    public static void printPlaylistSongs() {
        String playlistName;
        System.out.print("Write down the desired playlist: ");
        playlistName = scanner.nextLine();
        if (playlistExists(playlistName)) {

            for (int i=0; i < playlists.size(); i++) {

                if (playlists.get(i).getPlaylistName().equals(playlistName)) {

                    playlists.get(i).printSongsFromPlaylist();
                }
            }
        } else {

            System.out.println("Playlist " + playlistName + "doesn't exist");
        }
    }

    public static ArrayList<Playlist> getPlaylists() {
        return playlists;
    }


    public static void choosePlaylist() {
        String playlistName;
        System.out.print("Write down which playlist you want to play:");
        playlistName = scanner.nextLine();
        if (playlistExists(playlistName)){

            for (int i=0; i < playlists.size(); i++) {

                if (playlists.get(i).getPlaylistName().equals(playlistName)) {

                    playlists.get(i).playPlaylist();
                    break;
                }
            }
        } else {

            System.out.println("Playlist " + playlistName + " doesn't exist.");
        }
    }


}
