package com.me;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;
    private static int count;


    @org.junit.BeforeClass
    public static void beforeClass(){
        System.out.println("This executes before any test cases. Count = " + (count++));
    }


    @org.junit.Before
    public void setup(){
        account = new BankAccount("Tim","Buchalka",1000, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }


    @org.junit.Test
    public void deposit() throws Exception {
        double balance = account.deposit(200.00,true);
        assertEquals(1200.00,balance, 0);
    }

    @org.junit.Test (expected = IllegalArgumentException.class)
    public void withdraw_notBranch() throws Exception {
        // the goal is to test if the exception is thrown
        account.withdraw(600,false);

///////////////////////////////////////////////////////////////////////////
        // doing it using the an earlier junit version, earlier than junit4
//        try{
//            account.withdraw(600.00,true);
//            fail("Should have trhown an IllegalArgument Exception");
//        }
//        catch (IllegalArgumentException e){
//
//        }
///////////////////////////////////////////////////////////////////////////


    }

    @org.junit.Test
    public void withdraw_branch() throws Exception {
        double balance = account.withdraw(600,true);
        assertEquals(400.00,balance,0);
    }

    @org.junit.Test
    public void getBalance_deposit() throws Exception {
        double balance = account.deposit(200.00,true);
        assertEquals(1200.00,account.getBalance(),0);
    }

    @org.junit.Test
    public void getBalance_withdraw() throws Exception {
        double balance = account.withdraw(200.00,true);
        assertEquals(800,account.getBalance(),0);
    }

    @org.junit.Test
    public void isChecking_true() throws Exception {
        assertTrue("The account is a checking account", account.isChecking());
    }


    @org.junit.AfterClass
    public static void afterClass() {
        System.out.println("This executes after any test cases Count = " + (count++));
    }

    @org.junit.After
    public void teardown(){
        System.out.println("Count = " + (count++));
    }

}