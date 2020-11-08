import java.util.ArrayList;
import java.util.Scanner;

public class Monsters implements ISaveable {

    private ArrayList<String> monsters;
    private Scanner scanner = new Scanner(System.in);

    public Monsters() {
        this.monsters =  new ArrayList<String>();;
    }

    @Override
    public void write() {
        System.out.print("Write down the name of the new player: ");
        monsters.add(scanner.nextLine());
    }

    @Override
    public void read() {
        System.out.println("List of players");
        for (int i=0; i<monsters.size(); i++) {

            System.out.println((i+1) + ". " + monsters.get(i));
        }
    }

}
