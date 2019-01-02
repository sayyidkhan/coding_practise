package vipCustomer.me;

public class vipCustomer {
    // Create a new class VipCustomer
    // it should have 3 fields name, credit limit, and email address.
    // create 3 constructors
    // 1st constructor empty should call the constructor with 3 parameters with default values
    // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
    // 3rd constructor should save all fields.
    // create getters only for this using code generation of intellij as setters wont be needed
    // test and confirm it works.

    // constructors
    public vipCustomer() {
        this("no name",0,"nil");
    }

    public vipCustomer(String name, double creditLimit) {
        this(name,creditLimit,"nil");
    }

    public vipCustomer(double creditLimit, String email) {
        this("no name",creditLimit,email);
    }

    public vipCustomer(String name, String email) {
        this(name,0,email);
    }

    public vipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    // fields
    private String name;
    private double creditLimit;
    private String email;

    // getter functions
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void printValues(){
        System.out.println("vip customer name: " + this.name);
        System.out.println("vip customer credit limit: " + this.creditLimit);
        System.out.println("vip customer email: " + this.email);
    }
}
