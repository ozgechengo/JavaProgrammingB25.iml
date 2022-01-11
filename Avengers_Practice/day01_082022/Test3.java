package day01_082022;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Test3 {

    public static void main(String[] args) {

     char[] letters={'a','b','d','e','f'};

     char[] letters2=reverseChar(letters);
        System.out.println(Arrays.toString(letters2));

    }

    public static char[]  reverseChar(char[] chars){

        char []  chars1=new char[chars.length];


        for (int i =chars.length-1,j=0; i >=0 ; i--,j++) {

            chars1[j] = chars[i];
        }



        return chars1;
    }




    }



  //  3. Create a method that can reverse a char array