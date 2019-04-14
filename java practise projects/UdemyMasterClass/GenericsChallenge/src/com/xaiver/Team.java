package com.xaiver;

public abstract class Team {

    private String teamName;
    private int totalScore;

    public Team(String teamName,int totalScore) {
        this.teamName = teamName;
        this.totalScore = totalScore;
    }


    public String getTeamName() {
        return teamName;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

}
