package com.me;

import static com.me.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Helllo from MyRunnable's implementation of run.");
    }
}
