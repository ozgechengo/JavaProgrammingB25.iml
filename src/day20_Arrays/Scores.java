package day20_Arrays;

import java.util.Arrays;

public class Scores {
    public static void main(String[] args) {
        int[]scores =new int[5];


        scores[0]=55;
        scores[1]=65;
        scores[2]=75;
        scores[3]=85;
        scores[scores.length-1]=95;




        System.out.println(Arrays.toString(scores));
    }
}
