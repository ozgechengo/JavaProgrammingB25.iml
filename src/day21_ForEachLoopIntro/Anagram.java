package day21_ForEachLoopIntro;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        char [] ch1 ={'l','i','s','t','e','n'};
        char [] ch2 ={'s','i','l','e','n','t'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean cheq=Arrays.equals (ch1,ch2);

        System.out.println(cheq);
    }
}
