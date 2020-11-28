import java.util.LinkedList;
import java.util.Scanner;

public class League<T extends Player> {

    private LinkedList<Player> teams;
    private String leagueType;
    private String name;

    private static Scanner scanner = new Scanner(System.in);

    public League(String leagueType, T player, String name) {

        this.name = name;
        this.leagueType = leagueType;
        teams = new LinkedList<>();

        System.out.print("Write down the name of the first team: ");
        String teamName = scanner.nextLine();
        //todo create first team
    }

    //todo add team

    //todo toString override + count of all teams

    //todo print sorted list of teams

    public LinkedList<Player> getTeams() {

        return teams;
    }


}
