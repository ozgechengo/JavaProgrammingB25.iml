package day17_WhileDoWhileLoops;

import java.util.Scanner;

public class EnterANumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);



        while(true){
            System.out.println("Enter a number :");
            int number = input.nextInt();
            if(number<0){
                 break;
            }
        }
    }
}
