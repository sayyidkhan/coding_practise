package ifKeywordAndCodeBlocks;

public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if(score == 4000)
            System.out.println("Your score is 5000"); // without the curly brackets, only one line is executed
            System.out.println("This is executed");

        if(gameOver){ //"gameOver == true" is the same as just putting "gameOver", it will validate as true
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("your Final score was " + finalScore);
        }

        // Print out a second score on the screen with teh following
        // score set to 10,000
        // levelCompleted set to 8
        // bonus set to 200
        // but make sure the first printout above still displays as well

        score = 10000;
        levelCompleted = 8;
        bonus = 2_00;
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your Final score was " + finalScore);

        }

        }
}
