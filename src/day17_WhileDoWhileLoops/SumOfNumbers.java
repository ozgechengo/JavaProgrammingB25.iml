package day17_WhileDoWhileLoops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num =scan.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter second number");

        int num2 = scan2.nextInt();
        int total = 0;


        while (!( num>0&&num2>0)) {
            System.out.println("INVALID");
            break;
        }

             if( num>0&&num2>0){
              total = num + num2;

            System.out.println(total);}


        }}

