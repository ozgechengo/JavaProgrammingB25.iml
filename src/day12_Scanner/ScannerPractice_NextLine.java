package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice_NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("ENTER YOUR FULL NAME");
        String fullName = input.nextLine();

        System.out.println("Enter Your Programming Language");
        String programming = input.nextLine();

        System.out.println("Enter Your Age");
        int age =input.nextInt();



    }



}
