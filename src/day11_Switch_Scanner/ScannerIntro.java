package day11_Switch_Scanner;


import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an INTEGER : ");

        int num1 = input.nextInt();

        System.out.println("Enter an DECIMAL :");

        double num2 = input.nextDouble();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("MULTIPLICATION  : " + (num1 * num2));


        System.out.println("Enter an integer");
        int num3 =input.nextInt();

        System.out.println(num3);

    }}
