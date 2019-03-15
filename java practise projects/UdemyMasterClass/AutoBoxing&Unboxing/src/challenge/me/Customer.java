package challenge.me;

import java.util.ArrayList;

public class Customer {

    private String customerName;
    private ArrayList<Double> transactions;
    private double bankBalance;

    public String getCustomerName() {
        System.out.println("Customer name: " + this.customerName);
        return customerName;
    }

    private double getBankBalance() {
        System.out.println("Current Balance is " + this.bankBalance);
        return bankBalance;
    }

    public Customer(String customerName,double newTransaction) {

        this.customerName = customerName;
        this.transactions = new ArrayList<Double>();
        this.transactions.add(newTransaction);
        updateBankBalance(newTransaction);
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
