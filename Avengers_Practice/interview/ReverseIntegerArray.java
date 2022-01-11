package interview;

import java.util.Arrays;

public class ReverseIntegerArray {

    public static void main(String[] args) {


    }
   public static int [] reverseintArray(int[] args) {

       int [] nums={2,3,43,342,32,2,121};
       int [] reverse=reverseintArray(nums);


        int[] result = new int[args.length];


        for (int i = args.length - 1, j=0 ; i >= 0; i--,j++) {

            result[j]=args[i];



        }


        return result;
    }


}
