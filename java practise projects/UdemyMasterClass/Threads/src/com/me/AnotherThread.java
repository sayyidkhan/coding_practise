package com.me;


import static com.me.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        //super.run();
        System.out.println(ANSI_BLUE + "hello from another thread.");
    }


}
