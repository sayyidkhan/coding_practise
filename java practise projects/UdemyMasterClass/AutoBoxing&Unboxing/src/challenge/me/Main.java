package challenge.me;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.

        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch

        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code

        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        /*
        Customer jackson = new Customer("Jackson",25.02);
        jackson.addNewTransaction(30);
        jackson.addNewTransaction(20);
        jackson.addNewTransaction(-10);
        jackson.readAllTransactions();
        jackson.getCurrentBalance();
        */

        /*
        Branch branch1 = new Branch("branch1");
        branch1.createNewCustomer("jackson",10.20);
        branch1.createNewCustomer("nizam",20.10);
        branch1.showAllCustomers();
        branch1.searchForCustomer("jackson");
        branch1.addNewTransaction("jackson",20.40);
        */

        Bank bank1 = new Bank("appleBank");
        bank1.addNewBranch("samsungBank");
        //bank1.showAllBranches();
        //bank1.searchForBranch("jacksonbank");
        bank1.searchForBranchObject("appleBank").createNewCustomer("jackson",20.20);
        bank1.searchForBranchObject("appleBank").createNewCustomer("sally",50.20);

        // need to move the create the customer into the bank file

    }

}
