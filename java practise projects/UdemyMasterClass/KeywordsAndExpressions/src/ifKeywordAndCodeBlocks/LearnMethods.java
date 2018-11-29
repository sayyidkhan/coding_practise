package ifKeywordAndCodeBlocks;

public class LearnMethods {

    public static void main(String[] args) {
        // learning how to use methods
        int highScore = calculateScore(true, 800,5,100);
        System.out.println("Your Final score was " + highScore);
        highScore = calculateScore(true, 10000, 8,200);
        System.out.println("Your Final score was " + highScore);
    }

    // creating a new method
    // you cannot put a method within a method u have to put it outside the method

    /////////////////// this is a method //////////////////
    public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus) {
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }
    /////////////////// this is a method //////////////////

}
