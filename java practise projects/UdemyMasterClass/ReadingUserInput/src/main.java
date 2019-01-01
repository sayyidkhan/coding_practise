import java.time.Year;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt(); // to check if it the next line is int

        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key)

            System.out.println("Enter your Name: ");
            String name = scanner.nextLine();

            int year = Year.now().getValue(); // year now API
            int age = year - yearOfBirth;
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid Year of Birth");
            }
        }
        else {
            System.out.println("Unable to parse year of birth");
        }



        scanner.close(); // to save on memory

    }


}
