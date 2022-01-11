package day11_Switch_Scanner;

public class CydeoBatchesSwithc {
    public static void main(String[] args) {


          String batchType = "USMorning";
          String result    = " ";

             switch (batchType) {

                 case "USMorning":
                     result = ("Class times are 10-5 EST. M, T, Th, F.");
                     break;
                 case "US evening":
                     result = "Class times are 7-10 EST. M, T, W, Th, S, S";
                     break;
                 case "UK":
                     result = "Class times are  10-5 EST. M, T, W, Th, F.";
                     break;
                 default:
             } System.out.println(batchType + " = " + result);


             }}