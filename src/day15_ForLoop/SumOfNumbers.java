package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

                   int total = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");

             int num= scan.nextInt();

            for (int  i = num; i >= 1; i--){

                  total +=5;
        }
                     System.out.println(total);
    }
}

