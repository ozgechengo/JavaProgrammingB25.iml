package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
   int[] array={1,1,5,30,56,78,97,2,2,66,7,3,3,4,66,7,9,9,4,5};
       int[] unique= uniqueElement(array);
       Arrays.sort(unique);
        System.out.println(Arrays.toString(unique));
    }

    public static int[] uniqueElement(int[] array) {
        int[] result={};


        for (int each:array){
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result=ArraysUtility.addElement(result,each);
            }

        }
        return result;
}}
