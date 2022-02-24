package interview;

import java.util.Arrays;

public class MergeTwoStringArrays {


    public static String[] mergetwoArrays(String[] arrs, String[] arrs2) {


        String[] merged = new String[arrs.length + arrs2.length];


        int i = 0;

        for (String each : arrs) {
            merged[i] = each;
            i++;


        }
        for (String each : arrs2) {
            merged[i] = each;
            i++;
        }

        return merged;
    }

    public static void main(String[] args) {

        String[] arr1 = {"ozge", "burak", "berk"};
        String[] arr2 = {"ozge2", "burak2", "berk2", "ozge3"};

        System.out.println(Arrays.toString(mergetwoArrays(arr1, arr2)));


    }
}

