package day26_CustomMethodPractice;

import java.util.Arrays;
import utilities.ArraysUtility;
public class ReverseArray {

    public static void main(String[] args) {

        int [] array={3,23,42,23,32,323,2,233,2};
        int []result=reverse(array);
        System.out.println(Arrays.toString(result));
    }
        public static int[] reverse(int[] array){

            int[] result = {};

            for (int i = array.length - 1; i >= 0; i--) {
                result = ArraysUtility.addElement(result, array[i]);
            }

            return result;
        }

    }