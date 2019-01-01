import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
        alternativeSolution();

    }

    public static void alternativeSolution() {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE; // hold the min int possible
        int max = Integer.MIN_VALUE; // hold the max int possible

        while (true) {
            System.out.println("Enter Number");

            boolean isNextInt = scanner.hasNextInt(); // to check if it the next line is int
            if (isNextInt) {
                int number = scanner.nextInt();

                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine(); // handle enter
        }
        System.out.println("Min = " + min + ", Max = " + max);
        scanner.close();
    }

    public static void minAndMaxInputChallenge(){

    Scanner scanner = new Scanner(System.in);

    int min = 0;
    int max = 0;
    boolean first = true; // to allow the numbers to be initalised once
        while(true)

    {
        System.out.println("Enter Number :");
        boolean hasNextInt = scanner.hasNextInt(); // to check if it the next line is int
        if (hasNextInt) {
            int userInput = scanner.nextInt();
            if (first) {
                first = false;
                min = userInput;
                max = userInput;
            }
            if (userInput > max) {
                max = userInput;
            }
            if (userInput < min) {
                min = userInput;
            }
        } else {
            System.out.println("The min num is: " + min);
            System.out.println("The max num is: " + max);
            break;
        }
        scanner.nextLine(); // handle the enter
    }
        scanner.close();

}


}
