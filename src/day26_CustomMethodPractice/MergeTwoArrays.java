package day26_CustomMethodPractice;

public class MergeTwoArrays {

    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];

        int i= 0;

        for (int each : arr1) {
            result[i] = each;
            i++;
        }

        for (int each : arr2) {
            result[i] = each;
                   i++;
        }

        return result;

    }


}