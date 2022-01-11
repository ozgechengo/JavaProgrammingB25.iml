package day14_String;

import java.util.Scanner;

public class CatsAndDogs {
    public static void main(String[] args) {


        String s = "Dog Dog Dog Dog Dog Dog";

        s=s.replace("Dog","CAT");
              System.out.println(s);
        String s2 = "Dog Dog Dog Dog Dog Dog";
        s2=s2.replaceFirst("Dog","CAT");
              System.out.println(s2);


    }





}
