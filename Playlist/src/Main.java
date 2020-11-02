import java.util.Scanner;

public class Main {

    // Create a program that implements a playlist for songs
    // Create a Song class having Title and Duration for a song.
    // The program will have an Album class containing a list of songs.
    // The albums will be stored in an ArrayList
    // Songs from different albums can be added to the playlist and will appear in the list in the order
    // they are added.
    // Once the songs have been added to the playlist, create a menu of options to:-
    // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
    // List the songs in the playlist
    // A song must exist in an album before it can be added to the playlist (so you can only play songs that
    // you own).
    // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
    // started tracking the direction we were going.
    // As an optional extra, provide an option to remove the current song from the playlist
    // (hint: listiterator.remove()



    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //str1.compareTo(str2) - прави сравнение между текстови низове и връща число. 0 значи, че са равни. Отрицателно число означава, че
        //str1 по азбучен ред идва преди str2. Положително число означава, че str1 идва по азбучен ред след str2

        boolean quit = false;
        boolean isInt;
        int choice;
        AlbumLibrary albumLibrary = new AlbumLibrary();
        System.out.println("Album library initialized");
        printMenu();

        while (!quit) {

            isInt = scanner.hasNextInt();
            if (isInt) {

                choice=scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Invalid choice");
                choice=7;
            }
            switch (choice) {

                case 1:
                    System.out.print("Write the name of the album: ");
                    albumLibrary.addAnAlbum(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Write the name of the album where you want to add a song: ");
                    albumLibrary.addASong(scanner.nextLine());
                    break;
                case 3:
                    albumLibrary.printAlbumList();
                    break;
                case 4:
                    System.out.print("Write the name of the album which you want the songs for: ");
                    albumLibrary.printSongList(scanner.nextLine());
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    goToPlaylistMenu();
                    break;
                default:
                    System.out.println("Exiting program");
                    quit = true;
                    break;
            }
        }

    }

    private static void printMenu() {

        System.out.println("1. Add an album");
        System.out.println("2. Add a song to an existing album");
        System.out.println("3. Print the list of albums");
        System.out.println("4. Print list of songs from an album");
        System.out.println("5. Print the menu");
        System.out.println("6. Go to playlist menu");
        System.out.println("7. Quit");
        System.out.print("Make a choice: ");

    }

    private static void goToPlaylistMenu() {
        boolean quit = false;
        boolean isInt;
        int choice;

        System.out.println("1. Add a playlist");
        System.out.println("2. Add a song to a playlist");
        System.out.println("3. Play a playlist");
        System.out.println("4. Quit");

        isInt = scanner.hasNextInt();
        if (isInt) {

            choice = scanner.nextInt();
        }
        while (!quit) {


        }
    }

    private static void printPlaylistMenu(AlbumLibrary albumLibrary) {

        int choice;
        boolean isInt;
        albumLibrary.printAlbumList();
        System.out.println("Choose an album where you want the song from: ");
        isInt = scanner.hasNextInt();
        if (isInt) {
            choice = scanner.nextInt();

        }
    }
}
