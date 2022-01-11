package day21_ForEachLoopIntro;

import java.util.Arrays;

public class Anagram2 {
    public static void main(String[] args) {
        String str1="acdb";
        String str2="adbc";

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);
        boolean cheq=Arrays.equals (char1,char2);

        System.out.println(cheq);
    }
}



