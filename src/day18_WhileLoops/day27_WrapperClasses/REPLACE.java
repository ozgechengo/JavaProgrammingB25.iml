package day18_WhileLoops.day27_WrapperClasses;

import java.util.Arrays;

public class REPLACE {
    public static int[] replace(int[] array,int index,int newElement) {

           if(index<0||index>array.length-1){
               System.out.println("invalid");
               System.exit(0);
           }

         array[index]=newElement;

           return array;
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};


        System.out.println(Arrays.toString(replace(arr,2,4)));


    }
}
