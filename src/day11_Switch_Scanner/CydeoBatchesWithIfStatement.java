package day11_Switch_Scanner;

public class CydeoBatchesWithIfStatement {
    public static void main(String[] args) {
        String batchType = "EU";


        if(batchType=="EU" || batchType=="USMorning" || batchType=="USEvening"){

            if(batchType=="USmorning"){
                System.out.println("Class times are 10-5 EST. M, T, Th, F.");
            }else if(batchType=="USEvening"){
                System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
            }else{
                System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");
            }

        }else{
            System.out.println("Invalid Batch Number");
        }}}