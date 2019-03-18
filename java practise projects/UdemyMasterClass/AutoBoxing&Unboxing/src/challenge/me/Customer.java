package challenge.me;

import java.util.ArrayList;

public class Customer {

    private String customerName;
    private ArrayList<Double> transactions;
    private double bankBalance;

    public String getCustomerName() {
        return customerName;
    }

    public void printCustomerName() {
        System.out.println("Customer name: " + this.customerName);
    }

    public double getCurrentBalance() {

        return bankBalance;
    }

    public void printCurrentBalance() {
        System.out.println("Current Balance is " + this.bankBalance);
    }

    public Customer(String customerName,double newTransaction) {

        this.customerName = customerName;
        this.transactions = new ArrayList<Double>();
        addNewTransaction(newTransaction);
    }

    private void updateBankBalance(double value){
            bankBalance += value;
    }

    public void readAllTransactions(){
        System.out.println("Showing all transactions");
        for(int i = 0;i < transactions.size();i++){
            System.out.println( (i + 1) + ". Amount "  + this.transactions.get(i));
        }
    }

    public void addNewTransaction(double newTransaction){
        this.transactions.add(newTransaction);
        updateBankBalance(newTransaction);
    }

}
