package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    ArrayList<Integer> items = new ArrayList<>();

	    items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        //printDouble(items);

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");

        //Generics на практиката позволява да се добави параметър в <> скоби до името на класа. Този параметът може да се замени като
        // всеки друг тип променлива

        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);
        Team<SoccerPlayer> soccerTeam = new Team<>("Soccer team");
        soccerTeam.addPlayer(beckham);





    }

    private static void printDouble(ArrayList<Integer> n) {

        for (int i : n ) {

            System.out.println(i*2);
        }
    }



}
