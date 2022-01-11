package day17_WhileDoWhileLoops;

import java.util.Scanner;

public class negativenumber2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a Number");
        int num =input.nextInt();

        while (true) {
            System.out.println("Enter a number ");
            num=input.nextInt();
            if(num<0){
                break;
            }
        }
        System.out.println("THANK YOU");




    }
}
