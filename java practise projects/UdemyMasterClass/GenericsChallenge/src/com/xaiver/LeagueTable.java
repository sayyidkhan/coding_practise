package com.xaiver;

import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable <T extends Team> {

    private String leagueName;

    private ArrayList<T> teamList = new ArrayList<>();

    public LeagueTable(String leagueName) {
        this.leagueName = leagueName;
    }

    public boolean addPlayer(T team){
        if(teamList.contains(team)){
            System.out.println(team.getTeamName() + " is already added into this team");
            return false;
        }
        else{
            teamList.add(team);
            System.out.println(team.getTeamName() + " added into the " + this.leagueName + " league.");
            return true;
        }
    }

    public void matchResult(){

    }
    // using collections to compare

}
