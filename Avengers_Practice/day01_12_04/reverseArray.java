package day01_12_04;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {

        String str = "jdlaskdjas";

        String result="";
        boolean palindrome=false;



        for (int i =str.length()-1; i>=0 ; i--) {
            char ch=str.charAt(i);
              result+=ch;

        }

        if(result.equals(str)){

            System.out.println("is palindrome "+!palindrome);
        }else {
            System.out.println("is palindrome "+ palindrome);
        }

    }}