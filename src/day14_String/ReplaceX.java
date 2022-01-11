package day14_String;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {


        System.out.println("Please enter a word ");
        Scanner input =new Scanner(System.in);

         String word =input.next();

         word=word.replace("x","a").replace("X","a");


        System.out.println(word);




    }

}
