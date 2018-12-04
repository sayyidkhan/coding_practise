package com.xaiver;

public class MegaBytesConverter {

    /////////// for validation purposes ///////////
    public static void main(String[] args) {
    printMegaBytesAndKiloBytes(0);
    }
    /////////// for validation purposes ///////////

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int validateData = kiloBytes;
        if (validateData < 0){
            System.out.println("Invalid Value");
        }
        else{
            int mbValue = validateData / 1024;
            int kbValue = validateData % 1024;
            System.out.println(kiloBytes + " KB = " + mbValue + " MB" + " and " + kbValue + " KB");
        }

    }

}
