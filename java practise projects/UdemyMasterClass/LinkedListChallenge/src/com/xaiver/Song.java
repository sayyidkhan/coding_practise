package com.xaiver;

public class Song implements Cloneable{

    private String title;
    private Duration duration;

    public Song(String title,int hour,int minute,int seconds) {
        this.title = title;
        this.duration = new Duration(hour,minute,seconds);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getTitle() {
        return title;
    }

    public String getDuration(){
        return this.duration.getDuration();
    }

}
