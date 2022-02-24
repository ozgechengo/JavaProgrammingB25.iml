package interview;

public class ArrayFindMinimum {


    public static int findMininArray(int [] num) {
        int min=Integer.MAX_VALUE;

        for (int each:num) {
            if (each < min) {
                min = each;

            }

        }
        return min;
    }

    public static void main(String[] args) {


        int [] nums ={3,2,5,46,54,52,32,};

        System.out.println(findMininArray(nums));


    }

}
