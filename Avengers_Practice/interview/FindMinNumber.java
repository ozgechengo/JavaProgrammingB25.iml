package interview;

public class FindMinNumber {
    public static void main(String[] args) {

        int[] nums={12,23,45,67,78,89,};

        int min=nums[0];


        for (int each : nums) {
            if(each<min){
                min=each;
            }

        }
        System.out.println(min);
    }
}
