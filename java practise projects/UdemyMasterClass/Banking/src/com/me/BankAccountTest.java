package com.me;

import static org.junit.Assert.*;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() {
        BankAccount account = new BankAccount("Tim","Buchalka",1000, BankAccount.CHECKING);
        double balance = account.deposit(200.00,true);
        assertEquals(1200.00,balance, 0);
        assertEquals(1200.00,account.getBalance(),0);
    }

    @org.junit.Test
    public void withdraw() {
        fail("This test has yet to be implemented");
    }

    @org.junit.Test
    public void getBalance_deposit() {
        BankAccount account = new BankAccount("Tim","Buchalka",1000, BankAccount.CHECKING);
        double balance = account.deposit(200.00,true);
        assertEquals(1200.00,account.getBalance(),0);
    }

    @org.junit.Test
    public void getBalance_withdraw() {
        BankAccount account = new BankAccount("Tim","Buchalka",1000, BankAccount.CHECKING);
        double balance = account.withdraw(200.00,true);
        assertEquals(800,account.getBalance(),0);
    }

    @org.junit.Test
    public void isChecking_true(){
        BankAccount account = new BankAccount("Tim","Buchalka",1000, BankAccount.CHECKING);
        assertTrue("The account is a checking account", account.isChecking());
    }


}