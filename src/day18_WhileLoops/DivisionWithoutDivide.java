package day18_WhileLoops;

import java.util.Scanner;

public class DivisionWithoutDivide {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = scan.nextInt();
        System.out.println("Please enter a number:");
        int num2 = scan.nextInt();


        int result =0;
        int freq =0 ;

        if (num> 0 && num2>0 && num>num2) {

               while ( num>=num2 ){

                num = num-num2;
                freq++;}
            System.out.println(freq +" remain "+num);
        }
        else{
            System.out.println ("invalid");
        }


    } }


