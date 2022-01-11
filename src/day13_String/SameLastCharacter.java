package day13_String;

import java.util.Scanner;

public class SameLastCharacter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please write your sentence");
        String  sentence  =input.next();

        char  first  =sentence.charAt(0);
        int   lenght =sentence.length();
        char  last  =sentence.charAt(lenght -1);

        if(first ==last){
            System.out.println("First and last letters are the same");}
        else {
            System.out.println("First and last letters are not the same");
        }
    }}

/* Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");

        String word = scan.next();

        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            System.out.println("first and last character are same");
        }
        else{
            System.out.println("First and last are different");
        }*/