package practice_12_08;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner  input =new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER");
        int numbers =input.nextInt();

        int result=1;


            for (int i =numbers; i >=1 ; i--) {
                     result*=i;}

        System.out.println(result);
    }
}
