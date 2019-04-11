package GenericsPart2;

public class Main {

    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<FootballPlayer>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago cubs");
        baseballTeam.addPlayer(pat);


        Team<SoccerPlayer> brokenTeam = new Team<>("manchester united");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(adelaideCrows,3,8);

        adelaideCrows.matchResult(fremantle,2,1);
        //adelaideCrows.matchResult(baseballTeam,1,1);


    }

}
