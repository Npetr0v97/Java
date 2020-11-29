import java.util.LinkedList;
import java.util.Scanner;

public class League<T extends Player> {

    private LinkedList<Player> teams;
    private String leagueType;
    private String name;
    public static final int FOOTBALL_LEAGUE = 1, BASKETBALL_LEAGUE = 2;

    private static Scanner scanner = new Scanner(System.in);
    private static boolean isInt;

    public League(T player, String name, int leagueType) {
        int playerHeight;
        String teamName, playerName;
        this.name = name;
        int footChoice, handChoice, role;
        switch (leagueType) {
            case FOOTBALL_LEAGUE:
                this.leagueType = "Football League"; // name of the created league

                System.out.print("Write down the name of the first team: ");
                teamName = scanner.nextLine(); //the needed data for the team constructor

                System.out.print("Choose the name of the first player: "); //the needed data for the football player
                playerName = scanner.nextLine(); // player name

                System.out.print("Choose the height of the player: "); // height of the player
                isInt = scanner.hasNextInt();
                if (isInt) {
                    playerHeight = scanner.nextInt();
                    scanner.nextLine();
                } else {
                    System.out.println("Invalid height.");
                    playerHeight = 180;
                }
                System.out.println("Choose preferred foot: \n 1. Left \n 2. Right");
                int footChoice;
                isInt = scanner.hasNextInt();
                if (isInt) {
                    footChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (footChoice < 1 || footChoice > 2) {
                        System.out.println("Invalid choice.");
                        footChoice = FootballPlayer.RIGHT_FOOT;
                    }
                } else {
                    System.out.println("Invalid choice.");
                    footChoice = FootballPlayer.RIGHT_FOOT;
                }

                teams.add(new Team<FootballPlayer>(teamName,new FootballPlayer(playerName,)));

        }

        teams = new LinkedList<>();



        //todo create first team
    }

    //todo add team

    //todo toString override + count of all teams

    //todo print sorted list of teams

    public LinkedList<Player> getTeams() {

        return teams;
    }


}
