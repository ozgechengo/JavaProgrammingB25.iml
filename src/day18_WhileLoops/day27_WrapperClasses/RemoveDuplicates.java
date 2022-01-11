package day18_WhileLoops.day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] array) {

         int[] result={};
        for (int each:array) {
            if(!(ArraysUtility.contains(result,each))){
               result= ArraysUtility.addElement(result,each);

            }


        }

        return result;
    }

    public static void main(String[] args) {
        int []number ={1,2,3,4,5,6,7,1,2,3,4,5,6,7,8,9,10,11};
        number=removeDuplicates(number);

        System.out.println(Arrays.toString (number));
    }
}
