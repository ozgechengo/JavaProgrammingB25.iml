package day14_String;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {


        System.out.println("Enter a word");
        Scanner input =new Scanner (System.in);
        String word =input.next();

           if(word.substring(0).contains("x")){
         //  if(word.charAt(0)=='x'){
               word=word.replaceFirst("x","a");

               System.out.println(word);


           }




    }

}
