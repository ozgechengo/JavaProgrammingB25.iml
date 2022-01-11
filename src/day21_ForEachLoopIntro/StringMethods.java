package day21_ForEachLoopIntro;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

         String str = "Java";
            char[] chars =str.toCharArray();
        System.out.println(Arrays.toString(chars));
        System.out.println("------------------------------------------------------------------------------------");
        for (char each:chars){
            System.out.println(each);
        }
    }
}
