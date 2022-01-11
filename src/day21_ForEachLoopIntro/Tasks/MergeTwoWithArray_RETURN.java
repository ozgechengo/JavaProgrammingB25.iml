package day21_ForEachLoopIntro.Tasks;

import java.util.Arrays;

public class MergeTwoWithArray_RETURN {
    public static void main(String[] args) {

        int[] array1={5,10,15};
        int[] array2={20,25};

        int[] array3  = mergeArray(array1,array2);

        System.out.println(Arrays.toString(array3));


        }



    public static int[] mergeArray    (int[]arr1, int[]arr2){
         int add=0;

        int[] array3=new int[arr1.length+arr2.length];

        for (int element : arr1) {
            array3[add++]=element;

        }
        for (int i : arr2) {
            array3[add++]=i;

        }

        return array3;


    }
}
