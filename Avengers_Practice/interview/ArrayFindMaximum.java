package interview;

public class ArrayFindMaximum {
    public static int findMaxinArray(int[] num) {

        int max=Integer.MIN_VALUE;

        for (int each : num) {
            if (each > max) {
                max = each;

            }
    }
    return max;


    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,6};
        System.out.println(findMaxinArray(nums));
    }

}

