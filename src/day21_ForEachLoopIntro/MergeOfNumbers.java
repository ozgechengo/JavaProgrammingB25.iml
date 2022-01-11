package day21_ForEachLoopIntro;

import java.util.Arrays;

public class MergeOfNumbers {
    public static void main(String[] args) {

        String[] num1={"1","2","3","4"};
        String[] num2={"5","6"};
         String[] sum =new String[num1.length+num2.length];
          int i= 0;
        for (String each : num1) {
            sum[i++]=each;

        }
        for (String each : num2) {
            sum[i++] = each;
        }
        System.out.println(Arrays.toString(sum));






    }
}






/*

1. write a program that can merge two arrays of integers
        Ex:
            arr1 = {1,2,3,4}
            arr2 = {5,6}

        output
            arr3 = {1,2,3,4,5,6}
 */