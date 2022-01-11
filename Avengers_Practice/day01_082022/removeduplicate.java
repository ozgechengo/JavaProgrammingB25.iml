package day01_082022;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class removeduplicate {
    public static void main(String[] args) {


          String str="ava";
          String reversed="";
           boolean ispalindrome=true;

        for (int i =str.length()-1; i >=0 ; i--) {
              reversed+=str.charAt(i);


        }

        System.out.println(str);
        System.out.println(reversed);
           if(reversed.equals(str)){
            System.out.println("Is it palindrome  "  +ispalindrome);

        }else {
               System.out.println(!ispalindrome);
           }



        }}

