package challenge.tim;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer>  customers;


    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public boolean newCustomer(String customerName,double initialAmount){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName,initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName,double amount) {
        Customer existingCustomer =findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        for(int i = 0;i < this.customers.size(); i++){
            Customer checkedCustomers = this.customers.get(i);
            if(checkedCustomers.getName().equals(customerName)){
                return checkedCustomers;
            }
        }
        return null;
    }

    public ArrayList<Customer> getCustomers(){
        return customers;
    }

}
