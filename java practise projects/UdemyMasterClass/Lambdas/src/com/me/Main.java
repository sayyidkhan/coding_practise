package com.me;

public class Main {

    public static void main(String[] args) {
	// write your code here
        new Thread(new CodeToRun()).start();

    }
}

class CodeToRun implements Runnable {
    @Override
    public void run(){
        System.out.println("Printing from the Runnable");
    }
}
