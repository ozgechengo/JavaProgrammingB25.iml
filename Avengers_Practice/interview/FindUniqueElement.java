package interview;

public class FindUniqueElement {

        public static int findUniqueElement(int [] nums) {


            int  result =0;
            for (int each : nums) {
                int frequency = 0;

                for (int number : nums) {
                    if (each == number) {
                        frequency++;
                    }
                }
                if (frequency == 2) {
                    result+=each ;
                    break;
                }}


            return result;
        }


        public static void main(String[] args) {

            int[] nums ={3,3,4,4,2,4,99,6,4,3,3,2};


            System.out.println(findUniqueElement(nums));
        }}


