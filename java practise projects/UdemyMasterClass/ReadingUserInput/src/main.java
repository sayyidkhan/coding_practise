import java.time.Year;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handle next line character (enter key)

        System.out.println("Enter your Name: ");
        String name = scanner.nextLine();

        int year = Year.now().getValue(); // year now API
        int age = year - yearOfBirth;

        System.out.println("Your name is " + name
        + ", and you are " + age + " years old."
        );


        scanner.close(); // to save on memory

    }


}
