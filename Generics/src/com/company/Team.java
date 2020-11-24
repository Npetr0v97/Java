package com.company;

import java.util.ArrayList;

public class Team<T extends Player> {



    // тук се декларира, че този клас Team приема допълнителен параметър T

    //този параметър прави класа по-гъвкав като с него могат да се използват динамично методи, при които се входират разлини типове параметри
    //слагайки extends Player е допълнение, което ни поставя ограничение. Това значи, че T трябва да е клас, който е подчинен на Player
    //тук може да се използва и Implements, т.е. класът да е подчинен на даден интерфейс

    //public class Team<T extends Player> - тук може да се наследяват няколко класа едновременно.
    //примерно - public class Team<T extends Player & Coach & Manager>

    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members =  new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {

        if (members.contains(player)) {

            System.out.println(player.getName() + " is already on this team.");
            return false;
        } else {

            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers() {

        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {

        if (ourScore > theirScore) {

            won++;
        } else if (ourScore == theirScore){

            tied++;
        } else {

            lost++;
        }
        played++;

        if (opponent != null) {

            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {

        return  (won * 2) + tied;
    }
}
