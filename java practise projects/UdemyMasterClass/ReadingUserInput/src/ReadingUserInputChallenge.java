import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
    readingUserInputChallenge();
    }

    public static void readingUserInputChallenge() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for(int counter = 1; counter <= 10; counter++){

                System.out.println("Enter Number #" + counter + ": ");
            boolean hasNextInt = scanner.hasNextInt(); // to check if it the next line is int
            // have to be put in before the validation
            if(hasNextInt) {
                int numInput = scanner.nextInt();
                sum += numInput;
            }
            else{
                System.out.println("Invalid Number");
                counter -= 1;
            }
            scanner.nextLine(); // handle next line character (enter key)
        }
        scanner.close();
        System.out.println("Your total sum is: " + sum);
    }

}
