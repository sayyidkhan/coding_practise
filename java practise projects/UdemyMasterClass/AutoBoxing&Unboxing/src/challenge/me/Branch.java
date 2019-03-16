package challenge.me;

import java.util.ArrayList;

public class Branch {

    public String getBranchName() {
        return branchName;
    }

    private String branchName;
    private ArrayList<Customer> Customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.Customers = new ArrayList<Customer>();
    }

    public void createNewCustomer(String customerName,Double firstTransaction){
        if(findCustomer(customerName)){
            System.out.println("Customer name already exist");
        }
        else {
            this.Customers.add(new Customer(customerName.toLowerCase(), firstTransaction));
            System.out.println("customer " + customerName + " successfully added.");
        }
    }

    public void showAllCustomers(){
        for(int i = 0;i < this.Customers.size();i++){
            System.out.println("#########################");
            System.out.println("Showing Customer " + (i+1) + " of " + this.Customers.size());
            Customer currentCustomer = this.Customers.get(i);
            currentCustomer.printCustomerName();
            currentCustomer.printCurrentBalance();
            System.out.println("-------------------------");
            currentCustomer.readAllTransactions();
            System.out.println("#########################");
        }
    }

    private Customer searchForCustomerObject(String customerName){
        for(int i = 0;i < this.Customers.size();i++) {
            String currentCustomer = this.Customers.get(i).getCustomerName();
            if(currentCustomer.equals(customerName.toLowerCase())){
                return this.Customers.get(i);
            }
        }
        return null;
    }

    private boolean findCustomer(String customerName){
        // != null returns customer exist
        // == null customer does not exist
        return (searchForCustomerObject(customerName) != null);
    }

    public void searchForCustomer(String customerName){
        if(findCustomer(customerName)){
            System.out.println("Customer name " + customerName + " is found.");
            System.out.println("Customer Name : " + searchForCustomerObject(customerName).getCustomerName());
            System.out.println("Customer Current Balance : " + searchForCustomerObject(customerName).getCurrentBalance());
            System.out.println("-------------------------------");
            searchForCustomerObject(customerName).readAllTransactions();
        }
        else{
            System.out.println("Customer does not exist");
        }
    }

    public void addNewTransaction(String customerName,double transactionAmount){
        if(findCustomer(customerName)) {
            System.out.println("Transaction successfully added.");
            System.out.println("Current Balance: " + searchForCustomerObject(customerName).getCurrentBalance());
            searchForCustomerObject(customerName).addNewTransaction(transactionAmount);
            System.out.println("New balance: " + searchForCustomerObject(customerName).getCurrentBalance());
        }
        else{
            System.out.println("Unable to add new transaction, customer does not exist.");
        }
    }


}
