package StatementsWhiteSpaceAndIndenting;

public class Main {
    public static void main(String[] args) {
        int myVariable = 50; // the statement is the entire line
        int power = 2;

        if (myVariable == 50)
            System.out.println("printed");

        /*
        for (int counter = 0; counter < 4; counter++){
            myVariable++;
            System.out.println(myVariable);
        }
        */

        /*
        // using power operator in java
        for (int counter = 0; counter < 4; counter++){
            double final_value = Math.pow(myVariable,power);
            System.out.println(final_value);
            myVariable = myVariable + myVariable;
        }
        */

        int anotherVariable = 50; anotherVariable--;System.out.println(anotherVariable);
        // it can run all within the same line so long there is a semicolon;


    }
}
