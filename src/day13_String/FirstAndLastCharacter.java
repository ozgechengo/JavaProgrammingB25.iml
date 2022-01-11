package day13_String;

import java.util.Scanner;

public class FirstAndLastCharacter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter a sentence");
        String sentence=input.nextLine();

        char first = sentence.charAt(0);
        int length  = sentence.length();
        char last = sentence.charAt(length -1);

        System.out.println("first = " + first);
        System.out.println("last = " + last);
        System.out.println("length = " + length);

    }
}
