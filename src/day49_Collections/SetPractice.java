package day49_Collections;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
                "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};

        Set<String> arr2 = new HashSet<>(Arrays.asList(arr));
        arr = arr2.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr2);


        System.out.println(Arrays.toString(arr));

        //Short cut   of line 12 + 13
        // arr= new HashSet<>(Arrays.asList(arr)).toArray(new String  [0]) ;
        Integer[] nums = {12, 7, 34, 5, 2, 2, 2, 3, 3, 3, 4, 5, 5, 6, 2, 7, 8, 9, 0, 11, 3, 2, 1, 1, 3, 4, 5, 6, 7, 87, 8,};


        nums = new TreeSet<>(Arrays.asList(nums)).toArray(new Integer[0]);

        System.out.println(Arrays.toString(nums));

        String str = "ztvjnkjnjnjnnnnhgghffdaaaaabbbbcccdddeee";
        String result = "";


        for (String each : new TreeSet<>(Arrays.asList(str.split("")))) {
            result+=each+Collections.frequency(Arrays.asList(str.split("")), each)+" ";

        }
        System.out.println(result);
        Set<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet", "Ahmet", "John", "James", "Breanna", "Shay", "Ahmet"));

        System.out.println(names);




    }


}
