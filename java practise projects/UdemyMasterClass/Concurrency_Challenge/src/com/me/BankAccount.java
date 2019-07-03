package com.me;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {

    private double balance;
    private String accountNumber;

    private Lock lock;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.lock = new ReentrantLock();
    }

    // 1st way - synchronized
//    public synchronized void deposit(double amount) {
//        balance += amount;
//    }
//
//    public synchronized void withdraw(double amount) {
//        balance -= amount;
//    }

    // 2nd way - synchronized
//    public void deposit(double amount) {
//        synchronized (this){
//            balance += amount;
//        }
//    }

//    public void withdraw(double amount) {
//        synchronized (this){
//            balance -= amount;
//        }
//    }


//    // using ReentrantLock - challenge 4
//    public void deposit(double amount) {
//        lock.lock();
//        try{
//            balance += amount;
//        }
//        finally {
//            lock.unlock();
//        }
//    }
//
//    // using ReentrantLock - challenge 4
//    public void withdraw(double amount) {
//        lock.lock();
//        try{
//            balance -= amount;
//        }
//        finally {
//            lock.unlock();
//        }
//    }

    public void deposit(double amount) {
        boolean status = false;
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                try{
                    balance += amount;
                    status = true;
                }
                finally {
                    lock.unlock();
                }
            }
            else{
                System.out.println("Could not get the lock.");
            }
        }
        catch(InterruptedException e){
            // do something here
        }
        System.out.println("Transaction status = " + status);
    }

    public void withdraw(double amount){
        boolean status = false;
        try{
            if(lock.tryLock(1000,TimeUnit.MILLISECONDS)){
                try{
                    balance += amount;
                    status = true;
                }
                finally {
                    lock.unlock();
                }
            }
            else{
                System.out.println("Could not get the lock.");
            }
        }
        catch (InterruptedException e){
            // do something here
        }
        System.out.println("Transaction status = " + status);
    }


    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public  void printAccountNumber(){
        System.out.println("Account number = " + accountNumber);
    }

}
