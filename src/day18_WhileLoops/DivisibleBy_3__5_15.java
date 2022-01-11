package day18_WhileLoops;

import java.util.Scanner;

public class DivisibleBy_3__5_15 {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        int  num =input.nextInt();

           String total3 ="";
           String total5 ="" ;
           String total15 ="";
         // for (int i = 1; i <=number ; i++) {
           for (int i = 1; i <=  num ; i++) {
                if(i%15 ==0){  // if (i % 15 == 0) {
               total15 += 1+" ";   // divBy15+=i+" ";

             } if(i%3==0 && num%5!=0){ // if(i%3==0 && i%5!=0){
                            total3 += i+" ";}       //  divBy3+=i+" ";

                         if(i %5==0&& i%3!=0 ){          // if(i%5==0 && i%3!=0){
                           total5+=i+ " ";               //      divBy5+=i+" ";
                         }

           }
               System.out.println(" Divisible by  3  : "+total3);
           // System.out.println("divBy15 = " + divBy15);
               System.out.println("Divisible by  5  : " +total5);
               System.out.println("Divisible by  15  : "+total15);}}