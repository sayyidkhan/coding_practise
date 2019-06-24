package com.me;

import static com.me.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(ANSI_PURPLE + "Hello from the main thread.");

        final Thread anotherThread = new AnotherThread();
        anotherThread.setName("=== Another Thread ===");
        anotherThread.start(); // run from another thread

        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN + "hello from the anoymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class's implementation of run()");
                try{
                    anotherThread.join(2000);
                    System.out.println(ANSI_RED + "AnotherThread terminated, or timed out, so I'm running again.");
                }
                catch (InterruptedException e){
                    System.out.println(ANSI_RED + "I couldn't wait after all. I was interrupted.");
                }
            }
        });
        myRunnableThread.start();


        System.out.println("3. hello again from the main thread.");

        // cant gurrantee which threads will execute first


    }
}
