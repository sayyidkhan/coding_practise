package com.xaiver;

public class Duration {

    private int seconds;
    private int minute;
    private int hour;

    public Duration(int hour, int minute, int seconds) {
        if(seconds > 59 || minute > 59){
            System.out.println("unable to set duration. seconds or minute exceed the 59 second or minute mark.");
        }
        else{
            this.seconds = seconds;
            this.minute = minute;
            this.hour = hour;
        }
    }

    public String getDuration(){
        return printDateTimeFormat(this.hour) + ":" + printDateTimeFormat(this.minute) + ":" + printDateTimeFormat(this.seconds);
    }

    private String printDateTimeFormat(int value){
        if(value >= 10){
            return String.valueOf(value);
        }
        else{
            return "0" + String.valueOf(value);
        }
    }


}
