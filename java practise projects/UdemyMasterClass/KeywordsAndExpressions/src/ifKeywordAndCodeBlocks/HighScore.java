package ifKeywordAndCodeBlocks;

public class HighScore {
    public static void main(String[] args) {

        // Create a method called displayHighScorePosition
        // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
        // you should display the players name along with a message like "managed to get into position" and the
        // position they got and further message "on the high score table".
        //
        // create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an int
        // the return data should be
        // 1 if the score is > 1000
        // 2 if the score is > 500 and < 1000
        // 3 if the score is > 100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400, and 50
        //

        displayHighScorePosition("Jack Dorsey", 1500);
        displayHighScorePosition("Bill Gates", 900);
        displayHighScorePosition("Larry ellison", 400);
        displayHighScorePosition("Steve Jobs",50);
        System.out.println("################################################");
        displayHighScorePosition("lousie",1000);
        displayHighScorePosition("carol",500);
        displayHighScorePosition("frank",100);
    }

    public static void displayHighScorePosition(String playersName, int playersScore) {
        int result = calculateHighScorePosition(playersScore);
        String userPosition = positionOfUser(playersScore);
        System.out.println(playersName + " Managed to get into the " +
                result + userPosition + " position on the high score table");

    }

    public static int calculateHighScorePosition(int score) {
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        }
//        else if (score >= 100){
//            return 3;
//        }
//
//        return 4;
        int position = 4; // assuming position 4 will be returned
        if (score >= 1000){
           position = 1;
        }
        else if (score >= 500){
           position = 2;
        }
        else if (score >= 100);{
            position = 3;
        }
        return position;
    }

    public static String positionOfUser(int score){
        if (score >= 1000) {
            return "st";
        } else if (score < 1000 && score >= 500) {
            return "nd";
        }
        else if (score >= 100 && score < 500){
            return "rd";
        }
        else {
            return "th";
        }
    }
}

