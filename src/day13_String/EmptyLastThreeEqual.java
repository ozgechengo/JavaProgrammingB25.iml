package day13_String;

import java.util.Scanner;

public class EmptyLastThreeEqual {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your string:");
        String word = scan.nextLine();
        int length  = word.length();


        if (length <= 0) {
            System.out.println("string is empty");
        } else if (length > 3) {
            System.out.print(word.charAt(word.length() - 3));
            System.out.print(word.charAt(word.length() - 2));
            System.out.print(word.charAt(word.length() - 1));

            // System.out.println(word.substring(word.length() - 3));
        } else if (length <=3) {
            System.out.println(word);
        }


    }
}