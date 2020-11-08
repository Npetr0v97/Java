import java.util.ArrayList;
import java.util.Scanner;

public class Players implements ISaveable {

    private ArrayList<String> players;
    private Scanner scanner = new Scanner(System.in);

    public Players() {
        this.players = new ArrayList<String>();
    }

    @Override
    public void write() {
        System.out.print("Write down the name of the new player: ");
        players.add(scanner.nextLine());
    }

    @Override
    public void read() {
        System.out.println("List of players");
        for (int i=0; i<players.size(); i++) {

            System.out.println((i+1) + ". " + players.get(i));
        }
    }

}
