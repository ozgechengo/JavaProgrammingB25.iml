package interview;

public class ArrayFindAllUniqueElements {
    public static String findAllUniqueElements(int [] nums) {


       String  result ="";
        for (int each : nums) {
            int frequency = 0;

            for (int number : nums) {
                if (each == number) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                result+=each+ " ";
            }}


            return result.trim();
        }


    public static void main(String[] args) {

        int[] nums ={3,3,4,4,5,4,0,6,4,3,3,2};


        System.out.println(findAllUniqueElements(nums));
    }}