package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementsToArray {
    public static int [] addInt(int[] array ,int element) {

        int result[]=new int[array.length+1];   //  yeni actigin array in boyutunun yetmesine emin olmak icin
                                                // ama 1 tane fazla veriyoruozki yeniyi ekleyebilsin
         int i=0;

        for (int each:array) {   // butun elementlerin herbirine tek tek  aliyoruz .
           result[i]=each;       // yeni array e assign ediyoruz.
               i++;
        }

        result[i]=element;

        return result;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};

        arr =addInt(arr,5);

        System.out.println(Arrays.toString(arr));
    }
}
