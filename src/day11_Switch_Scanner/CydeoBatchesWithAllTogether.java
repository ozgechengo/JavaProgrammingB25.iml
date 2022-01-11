package day11_Switch_Scanner;

public class CydeoBatchesWithAllTogether {
    public static void main(String[] args) {
        String batchType = "EU";
        String information = "";



        if ( batchType=="US morning"||batchType=="US evening"||batchType=="EU"){
            switch (batchType){
                case "US morning":
                    information ="Class times are 10-5 EST. M, T, Th, F.";
                    break;
                case "US evening":
                    information = "Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;
                default:
                    information="Class times are  10-5 EST. M, T, W, Th, F.";
            }
        }else{
            System.out.println("Invalid Batch");

        }
        System.out.println(information);
    }
}