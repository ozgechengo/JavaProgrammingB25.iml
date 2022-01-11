package day21_ForEachLoopIntro;

import java.util.Arrays;

public class CopyOfRange {
    public static void main(String[] args) {
        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        //index:         0   1   2   3   4   5   6   7   8  9
        int[] result = Arrays.copyOfRange(scores, 3, 8);


        System.out.println(Arrays.toString(result));


        int[] result2 = Arrays.copyOfRange(scores, 5, scores.length);
        System.out.println(Arrays.toString(result2));






    }

}