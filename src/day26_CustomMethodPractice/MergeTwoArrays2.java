package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays2 {
    public static int[] merge(int[] array1 , int[] array2) {

        int[] result = {};

        for (int each : array1) {

            result = ArraysUtility.addElement(result, each);
        }
        for (int each : array2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }


      public static void main(String[] args) {

       int[]num1={3,4,5,6,7,8,99,};
       int[]num2={4,6,7,7,8,9,9,0};
       int[]num3 =merge(num1,num2);
       Arrays.sort(num3);

          System.out.println(Arrays.toString(num3));
    }
}

