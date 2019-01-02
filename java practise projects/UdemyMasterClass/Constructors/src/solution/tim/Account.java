package solution.tim;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;



    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New Balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if(this.balance - withdrawalAmount < 0){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        }
        else{
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of" + withdrawalAmount + " Processed. Remaining balance = " + this.balance);
        }
    }

    // creating a empty constructor
    public Account(){
        // calling a constructor within a constructor with a default constructor
        // this have to be run on the first line
        this("56789",2.50,"no name","no email",88888888);
        System.out.println("Empty constructor called");
    }

    // creating a constructor
    public Account(String number, double balance, String customerName, String email, int phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // printing out the values
    public void printValues(){
        System.out.println("Customer Name: " + this.getCustomerName());
        System.out.println("Account Number: " + this.getNumber());
        System.out.println("Account Number: " + this.getBalance());
        System.out.println("Account Number: " + this.getPhoneNumber());
        System.out.println("Account Number: " + this.getEmail());
    }

    // you can create constructors using the "command" + "N", then selecting which parameters u want to build
    // a constructor with
    public Account(String customerName, String email, int phoneNumber) {
        this("99999",100,customerName,email,phoneNumber); // this will call the main constructor
    }

}
