package day21_ForEachLoopIntro;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] nums ={86,45,43,23,24,55};
        System.out.println(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println(nums[0]);

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("Min Score :"+nums[0]);
        System.out.println("Max Score :"+nums[nums.length-1]);


        String [] names= {"Ozge" ,"Cihan ","Hikmet", "Burak","Berk","Emine"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        String []words={"Anna","ANNA"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        System.out.println("--------------------------------------------------");


        int[] arr1 ={1,3,2};
        int[] arr2 ={1,2,3};
        boolean r1 = Arrays.equals(arr1,arr2);

        System.out.println(r1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r2= Arrays.equals(arr1,arr2);

        System.out.println(r2);
    }
}
