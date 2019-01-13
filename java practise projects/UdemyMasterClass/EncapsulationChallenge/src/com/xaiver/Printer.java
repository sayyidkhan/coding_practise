package com.xaiver;

import java.util.Scanner;

public class Printer {

    private Toner toner;
    private String brand;

    public Printer(Toner toner, String brand) {
        this.toner = toner;
        this.brand = brand;
    }

    public void pagesToPrint(){

        System.out.println("How many pages would u like to print ?");
        // calling the scanner object
        Scanner scan = new Scanner(System.in);
        int pagesPrinted = scan.nextInt();
        scan.nextLine();

        if(pagesPrinted > 1){
            printPages(pagesPrinted);
        }else{
            System.out.println(" number cannot be 0 or less than 0 ");
        }

        System.out.println("Print Task: Completed");

    }

    private void printPages(int noOfPages){
        System.out.println("printing pages");
        for(int counter = 0; counter < noOfPages; counter++){
                int validateData = this.toner.useInk();
                if(validateData == 1) {
                    System.out.println("##################");
                    System.out.println("Printing page " + (counter + 1) + " of " + noOfPages);
                    checkInkBalance();
                    if((counter + 1) == noOfPages){
                        totalPagesPrinted((counter + 1));
                        break;
                    }
                }
                else{
                    System.out.println("printing stopped");
                    checkInkBalance();
                    totalPagesPrinted((counter + 1));
                    break;
                }
        }

        }

    public void totalPagesPrinted(int pages){
        System.out.println("################");
        System.out.println("Total Pages printed:" + pages);
        System.out.println("################");

    }

    private void checkInkBalance(){
        this.toner.inkBalance();
    }

}

// write a duplex printer class

