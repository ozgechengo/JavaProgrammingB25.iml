package day26_CustomMethodPractice;

import java.util.Arrays;
import utilities.ArraysUtility;

public class RemoveElements {
    public static void main(String[] args) {
        int []numbers={100,200,300,466,777,888,33,23};

        numbers=removeElement(numbers,1);
        numbers=removeElement(numbers,1);
        System.out.println(Arrays.toString(numbers));
    }

    //                              {1,2,3,4, 3}   ,    4
    public static int[] removeElement(int[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        int[] result = new int[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j] = array[i];
                j++;
        }

        return result;
    }



}

/*
2. Create a class named RemoveElements:
			2.1 Create a method that passes two parametetrs: an integer array and an integer index. the method removes the element at the given index of the array and returns the new array
					Ex:
						int[] arr = {10,20,30,40}
						removeElement(arr, 2) ==> {10, 20, 40}
			2.2 Create a method that passes two parametetrs: a double array and an integer index. the method removes the element at the given index of the array and returns the new array
			2.3 Create a method that passes two parametetrs: a char array and an integer index. the method removes the element at the given index of the array and returns the new array
			2.4 Create a method that passes two parametetrs: a String array and an integer index. the method removes the element at the given index of the array and returns the new array
 */