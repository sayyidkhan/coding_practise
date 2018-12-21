package com.xaiver;

public class FlourPacker {

    public static void main(String[] args) {
        /*
        System.out.println(canPack(1,0,4)); // false
        System.out.println(canPack(1,0,5)); // true
        System.out.println(canPack(0,5,4)); // true
        System.out.println(canPack(2,2,12)); // true
        System.out.println(canPack(-3,2,12)); // true

        System.out.println(canPack(1,5,9)); // true
        */

        System.out.println(canPack(2,1,5)); // true
    }

    /*

    public static boolean canPack(int bigCount,int smallCount,int goal) {
        bigCount = bigCount * 5;

        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        else{

            if((bigCount + smallCount) == goal){
                return true;
            }
            else if ((bigCount + smallCount) > goal){
                bigCount -= goal;
                if(bigCount % 5 == 0){

                }
            }
            else{
                return false;
            }


        }
    }
    */

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if(bigCount < 0 || smallCount < 0 || goal < 0)
            return false;

        int remain = goal / 5;
        System.out.println(remain);
        int bigCountTotal = bigCount >= remain ? remain * 5 : bigCount * 5;
        return (bigCountTotal + smallCount) >= goal;

    }



}


/*

goal -= bigCount;
                if(goal > 0){
                    smallCount -= goal;
                    if(smallCount >= 0){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }

 */