package solution.tim;

public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account("12345",1000,"Bob Brown","abc@gmail.com",87654321); // this is creating the object

        /*
        Account sallyAccount = new Account();
        sallyAccount.printValues();
        System.out.println();
        bobsAccount.printValues();
        */

        Account timsAccount = new Account("Tim","time@email.com", 12345);
        System.out.println(timsAccount.getCustomerName());
        System.out.println(timsAccount.getNumber());

        /*

        bobsAccount.withdrawal(100);

        System.out.println();
        bobsAccount.deposit(50);
        bobsAccount.withdrawal(100);

        System.out.println();
        bobsAccount.deposit(51);
        bobsAccount.withdrawal(100);
        */

    }




}
