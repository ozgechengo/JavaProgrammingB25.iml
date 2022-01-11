package interview;

import java.util.Arrays;

public class MergeTwoStringArrays {
    public static void main(String[] args) {

        String [] arr1={"ozge","burak","berk"};
        String [] arr2={"ozge2","burak2","berk2","ozge3"};

        System.out.println(Arrays.toString(mergetwoArrays(arr1,arr2)));


    }

   public static String[] mergetwoArrays(String[] arrs,String[] arrs2) {



       String[] result = new String[arrs.length + arrs2.length];


       int i = 0;

       for (String each : arrs) {
           result[i] = each;
           i++;


       }
       for (String each : arrs2) {
           result[i] = each;
           i++;
       }

       return result;
   }


   }

