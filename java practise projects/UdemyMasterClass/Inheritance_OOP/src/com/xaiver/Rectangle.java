package com.xaiver;

public class Rectangle {

    private int x = 0;
    private int y = 0;
    private int width = 0;
    private int height = 0;

    public Rectangle(){
        this(0,0);
    }

    public Rectangle(int width,int height){
        this(0,0 ,width, height);
    }


    public Rectangle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

}
