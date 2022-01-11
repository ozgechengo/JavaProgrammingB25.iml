package day17_WhileDoWhileLoops;

import java.util.Scanner;

public class Ksenia {
    public static void main(String[] args) {


     Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.nextLine();
        String result ="";
        String b= word.substring(0,2);
        System.out.print(b);
        for (int i = word.length()-1; i >1; i--) {
            char a = word.charAt(i);

            System.out.print(a);


        }
        }
}
