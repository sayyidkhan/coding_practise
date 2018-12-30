import java.time.Year;

public class Main_Test {

    public static void main(String[] args) {

        int year = Year.now().getValue(); // year now API
        System.out.println(year);
    }

}
