import java.util.ArrayList;

public class Team<T extends Player> {

    private ArrayList<Player> players;
    private int won, lost, draw, score, played;
    private String name;



    public Team(String name, T player) {

        players = new ArrayList<Player>();
        this.name = name;
        this.played = 0;
        this.won = 0;
        this.lost = 0;
        this.draw = 0;

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
        played++;
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

    //todo toString override - team name + wins + losses + draws + score + played | toString

}
