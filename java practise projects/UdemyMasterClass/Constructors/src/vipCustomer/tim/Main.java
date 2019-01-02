package vipCustomer.tim;

public class Main {

    public static void main(String[] args) {

        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.

        vipCustomer bob = new vipCustomer("bob",1000); // bob with 1000 credit limit
        vipCustomer sam = new vipCustomer(2000,"sam@gmail.com"); // email with 2000 credit limit
        vipCustomer jack = new vipCustomer("sam","jack@gmail.com"); // sam with email
        vipCustomer noName = new vipCustomer();
        vipCustomer albert = new vipCustomer("albert",3000,"albert@gmail.com");

        bob.printValues();
        System.out.println();
        sam.printValues();
        System.out.println();
        jack.printValues();
        System.out.println();
        noName.printValues();
        System.out.println();
        albert.printValues();
        System.out.println();

    }


}
