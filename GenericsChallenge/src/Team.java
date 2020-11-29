import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {

    private ArrayList<T> players;
    private int won, lost, draw, score, played;
    private String name;



    public Team(String name, T player) {

        players = new ArrayList<>();
        this.name = name;
        this.played = 0;
        this.won = 0;
        this.lost = 0;
        this.draw = 0;
        this.score = 0;

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
            score+=3;
        } else if (ourScore < theirScore) {

            lost++;
        } else {

            draw++;
            score+=1;
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

    @Override
    public String toString() {

        return name + ": " + score + "PTS ( " + won + " wins, " + lost + " losses and " + draw + " draws from " + played + " played games)";
    }


    @Override
    public int compareTo(Team<T> team) {
        if (this.score > team.score) {

            return -1;
        } else if (this.score < team.score) {

            return 1;
        } else {
            return 0;
        }
    }
}
