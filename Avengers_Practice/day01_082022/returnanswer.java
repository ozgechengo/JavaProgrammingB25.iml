package day01_082022;

import java.sql.Array;
import java.util.Arrays;

public class returnanswer {
    public static void main(String[] args) {


        int[] numbers = {1,2,3,4,5,6};
        int [] reversed=new int[numbers.length];

//      for (int i = numbers.length - 1, j=0 ; i >= 0; i--, j++) {
        for (int i = numbers.length-1,j=0 ;i >=0 ;i--,j++) {
                    reversed[j]=numbers[i];
        }

        System.out.println(Arrays.toString(reversed));

    }


}
