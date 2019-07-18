package com.me;

public class Main {

    public static void main(String[] args) {
	// write your code here

        final BankAccount account = new BankAccount("12345-678",1000.00);

//        Thread trThread1 = new Thread(){
//            public void run(){
//                account.deposit(300.00);
//                account.withdraw(50.00);
//            }
//        };
//
//        Thread trThread2 = new Thread(){
//            public void run(){
//                account.deposit(203.75);
//                account.withdraw(100.00);
//            }
//        };

        Thread trThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                    account.deposit(300.00);
                    System.out.println("1.deposit: " + account.getBalance());
                    account.withdraw(50.00);
                    System.out.println("2.withdraw: " + account.getBalance());
            }
        });

        Thread trThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                    account.deposit(203.75);
                    System.out.println("3.deposit: " + account.getBalance());
                    account.withdraw(100.00);
                    System.out.println("4.withdraw: " + account.getBalance());
            }
        });

        trThread1.start();
        trThread2.start();

    }
}
