package com.xaiver;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Create a generic class to implement a league table for a sport.
        // The class should allow teams to be added to the list, and store
        // a list of teams that belong to the league.

        // Your class should have a method to print out the teams in order,
        // with the team at the top of the league printed first.

        // Only teams of the same type should be added to any particular
        // instance of the league class - the program should fail to compile
        // if an attempt is made to add an incompatible team.

        // compatible team
        Team manchesterUnited = new SoccerTeam("ManchesterUnited",10);
        Team liverpool = new SoccerTeam("Liverpool",20);
        Team chelsea = new SoccerTeam("chelsea",40);
        Team tottenham = new SoccerTeam("tottenham",50);

        //incompatible team
        Team laLakers = new BasketBallTeam("laLakers",70);

        LeagueTable<SoccerTeam> barclays = new LeagueTable<>("barclays");

        Team[] listOfTeams = {liverpool,manchesterUnited,tottenham,chelsea};
        for (Team team : listOfTeams){
            barclays.addTeam((SoccerTeam) team);
        }

        // barclays.addTeam(laLakers);

        // unsorted
        System.out.println();
        System.out.println("list of teams in unsorted order");
        barclays.printTeamResult();

        barclays.sortMatchResult();

        // sorted
        System.out.println();
        System.out.println("list of teams in sorted order");
        barclays.printTeamResult();


    }





}
