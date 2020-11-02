import java.util.ArrayList;
import java.util.Scanner;


public class AlbumLibrary {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Album> albums = new ArrayList<Album>();
/*
    public AlbumLibrary() {

        this.albums = new ArrayList<Album>();
    }
*/

    public static boolean albumExists(String albumName) {

        for (int i=0; i<albums.size(); i++) {

            if (albums.get(i).getAlbumName().equals(albumName)) {

                return true;
            }
        }

        return false;
    }

    public static void addAnAlbum(String albumName) {

        int comparison;
        boolean albumAdded=false;
        if (albumExists(albumName)) {

            System.out.println(albumName + " already exists");
        } else {
            System.out.print("Write down the artist name: ");
            String artist = scanner.nextLine();
            for (int i=0; i<albums.size(); i++) {
                comparison = albumName.compareToIgnoreCase(albums.get(i).getAlbumName());

                if (comparison < 0) {

                    albums.add(i,new Album(artist,albumName));
                    albumAdded = true;
                    break;
                }

            }

            if (!albumAdded) {

                albums.add(new Album(artist,albumName));
            }

            System.out.println("Album added");
        }

    }

    public static void addASong(String albumName) {

        if (!albumExists(albumName)) {

            System.out.println("Album with the name " + albumName + " doesn't exist");
        } else {

            for (int i=0; i<albums.size(); i++) {

                if (albums.get(i).getAlbumName().equals(albumName)) {

                    System.out.print("Write down the name of the song: ");
                    String songName = scanner.nextLine();
                    if (albums.get(i).songExists(songName)) {

                        System.out.println("Song with the name " + songName + " already exists");
                    } else {

                        albums.get(i).addASong(songName);
                    }
                }
            }
        }
    }

    public static void printAlbumList() {

        System.out.println("Album list:");

        for (int i=0; i<albums.size(); i++) {

            System.out.println((i+1) + ". " + albums.get(i).getAlbumName() + " by " + albums.get(i).getArtist());
        }
    }

    public static void printSongList(String albumName) {
        if (albumExists(albumName)) {

            for (int i=0; i<albums.size(); i++) {

                if (albums.get(i).getAlbumName().equals(albumName)) {

                    albums.get(i).printSongList();
                }
            }
        } else {

            System.out.println("Album with the name " + albumName + " doesn't exist");
        }
    }

    public static ArrayList<Album> getAlbums() {
        return albums;
    }
}
