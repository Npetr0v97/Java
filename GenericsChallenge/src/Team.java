import java.util.ArrayList;

public class Team<T extends Player> {

    private ArrayList<Player> players;
    private int won, lost, draw, score;
    private String name;



    public Team(String name, T player) {

        players = new ArrayList<Player>();
        this.name = name;

        addPlayer(player);
    }


    public void addPlayer(T player) {

        if (players.contains(player)) {

            System.out.println(player.getName() + "is already part of the team.");
        } else {

            players.add(player);
        }
    }

    public void playGame(Team<T> oppositeTeam, int ourScore, int theirScore, boolean drawPrint) {

        if (ourScore > theirScore) {
            System.out.println(name + " won.");
            won++;
        } else if (ourScore < theirScore) {

            lost++;
        } else {

            draw++;
            if (drawPrint) {

                System.out.println("Draw.");
            }
        }

        if (oppositeTeam!=null) {

            oppositeTeam.playGame(null, theirScore, ourScore, false);
        }
    }

    public void printPlayerList() {

        for (int i = 0; i < players.size(); i++) {

            System.out.println((i+1) + ". " + players.get(i).toString());
        }
    }

    //todo toString override - team name + wins + losses + draws + scoreto

}
