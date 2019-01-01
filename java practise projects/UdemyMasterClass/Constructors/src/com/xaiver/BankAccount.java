package com.xaiver;

public class BankAccount {
    // Create a new class for a bank account
    // Create fields for the account number, balance, customer name, email and phone number.
    //
    // Create getters and setters for each field
    // Create two additional methods
    // 1. To allow the customer to deposit funds (this should increment the balance field).
    // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
    // but not allow the withdrawal to complete if their are insufficient funds.
    // You will want to create various code in the Main class (the one created by IntelliJ) to
    // confirm your code is working.
    // Add some System.out.println's in the two methods above as well.

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    // setter methods
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    // getter methods
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getEmail(){
        return this.email;
    }
    public int getPhoneNumber(){
        return this.phoneNumber;
    }

    // deposit funds
    public void setdepositFunds(double funds){

        this.balance = funds + this.balance;
        System.out.println();
        System.out.println("Depositing... " + funds);
        System.out.println("Deposit successful, New Balance: " + this.balance);

    }

    // withdraw funds
    public void setWithdrawalFunds(double funds){
        if(this.balance - funds >= 0) {
            this.balance = this.balance - funds;
            System.out.println();
            System.out.println("Withdrawing... " + funds);
            System.out.println("Withdrawal Successful, New Balance: " + this.balance);
        }
        else{
            System.out.println();
            System.out.println("Withdrawing... " + funds);
            System.out.println("Insufficient Funds\nbalance not withdrawn");
            System.out.println("Current Balance: " + this.balance);
        }
    }

}
