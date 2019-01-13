package com.xaiver;

public class Toner {

    private int red;
    private int green;
    private int blue;

    public Toner(int red, int green, int blue) {
        if(red > 0 && red <= 100) {
            this.red = red;
        }
        if(green > 0 && green <= 100) {
            this.green = green;
        }
        if(blue > 0 && blue <= 100) {
            this.blue = blue;
        }
    }

    //check ink balance
    public void inkBalance(){
        System.out.println("displaying ink balance");
        System.out.println("red: " + red);
        System.out.println("green: " + green);
        System.out.println("blue: " + blue);
    }

    public int useInk(){
        int red = reduceInk();
        int green = reduceInk();
        int blue = reduceInk();

        if(this.red > 0 && this.blue > 0 && this.green > 0) {

            if((this.red - red > 0) && (this.green - green > 0) && (this.blue - blue > 0)){
                this.red = this.red - red;
                this.green = this.green - green;
                this.blue = this.blue - blue;
                return 1;
            }
            else{
                System.out.println("unable to print pages, insufficent ink in cartidge");
                return 0;
            }
        }
        else{
            System.out.println("no ink in cartridge");
            return 0;
        }
    }

    private static int reduceInk() {
        double mathRandom = Math.random();
        double roundOff = (double) Math.round(mathRandom * 100) / 100;
        int finalValue = (int) (roundOff * 10);
        return finalValue;
    }


}
