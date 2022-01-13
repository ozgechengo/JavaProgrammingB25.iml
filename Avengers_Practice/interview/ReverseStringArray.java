package interview;

import java.util.Arrays;

public class ReverseStringArray {


    public static void main(String[] args) {

        String[] arrs={"ozge","burak","berk"};
        String[] arrs2=reverseStrig(arrs);

        System.out.println(Arrays.toString(arrs2));
    }

    public static String[] reverseStrig(String[] arr) {


        String[] arr2=new String[arr.length];

        for (int i =arr.length-1,j=0; i >=0 ; i--,j++) {

               arr2[i]=arr[j];


        }


        return arr2;
    }

}





    //  4. Create a method that can reverse a String array

