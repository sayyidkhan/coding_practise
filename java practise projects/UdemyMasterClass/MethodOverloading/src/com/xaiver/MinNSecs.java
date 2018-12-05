package com.xaiver;

public class MinNSecs {

    public static void main(String[] args) {
        String finalValue = getDurationSeconds(65,45);
        System.out.println(finalValue);
        String finalValue2 = getDurationSeconds(3945L);
        System.out.println(finalValue2);
    }

    public static String getDurationSeconds(long mins, long secs){
        if (mins >= 0 && (secs >= 0 && secs <= 59)){
            long hrs = mins / 60;
            mins = mins - (hrs * 60);

            if (secs <10 && mins <10 && hrs <10) {
                return "0" + hrs + " h " + "0" + mins + " m " + "0" + secs + " s ";
            }
            else if (secs <10 && mins <10){
                return hrs + " h " + "0" + mins + " m " + "0" + secs + " s ";
            }
            else if (secs < 10){
                return hrs + " h " + mins + " m " + "0" + secs + " s ";
            }
            else{
                return hrs + " h " + mins + " m " + secs + " s ";
            }
        }
        return "Invalid Value";
    }

    public static String getDurationSeconds(long secs) {
        if(secs >= 0){
        long mins = secs / 60;
        secs = secs - (mins * 60);
        return getDurationSeconds(mins,secs);
        }
        return "Invalid Value";
    }

}
