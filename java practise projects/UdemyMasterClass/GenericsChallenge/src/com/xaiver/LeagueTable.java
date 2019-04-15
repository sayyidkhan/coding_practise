package com.xaiver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LeagueTable <T extends Team> {

    private String leagueName;

    private ArrayList<T> teamList = new ArrayList<>();

    public LeagueTable(String leagueName) {
        this.leagueName = leagueName;
    }


    public boolean addTeam(T team){
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

    public int getTeamSize(){
        return this.teamList.size();
    }

    public ArrayList<T> getTeamList() {
        return teamList;
    }

    public void sortMatchResult(){
        Collections.sort(this.teamList, new sortByHighestScore() {
            @Override
            public int compare(Team a, Team b) {
                return super.compare(a, b);
            }
        });
        System.out.println("Teams have been sorted successfully");
    }

    public void printTeamResult(){
        for(int i = 0; i < this.getTeamSize();i++){
            String teamName = this.getTeamList().get(i).printTeamInfo();
            System.out.println((i+1) + ". " + teamName);
        }
    }


    private abstract class sortByHighestScore implements Comparator<Team>{

        public int compare(Team a,Team b){
            return a.getTotalScore() - b.getTotalScore();
        }

    }


}
