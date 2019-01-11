package com.xaiver;

public class Main {

    public static void main(String[] args) {
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

        // initialise the values //
        BankAccount user1 = new BankAccount();
        // initialise the values //

        // setter functions //
        user1.setCustomerName("Zack");
        user1.setAccountNumber(12345678);
        user1.setBalance(1000);
        user1.setEmail("abc@gmail.com");
        user1.setPhoneNumber(87654321);
        // setter functions //

        // Store getter functions in a variable //
        String user1_Name = user1.getCustomerName();
        int user1_AccountNumber = user1.getAccountNumber();
        double user1_Balance = user1.getBalance();
        String user1_Email = user1.getEmail();
        int user1_PhoneNumber = user1.getPhoneNumber();
        // Store getter functions in a variable //

        // printing out the values //
        printValues(user1_Name,user1_AccountNumber,user1_Balance,user1_Email,user1_PhoneNumber);
        // printing out the values //

        // deposit funds //
        double deposit = 100.20;
        user1.setdepositFunds(deposit);
        // deposit funds //

        // withdraw funds //
        double withdrawal = 1101.80;
        user1.setWithdrawalFunds(withdrawal);
        // withdraw funds //

    }

    public static void printValues(String customerName,int accountNumber,double balance,String email,int phoneNumber){
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: " + balance);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }

}
