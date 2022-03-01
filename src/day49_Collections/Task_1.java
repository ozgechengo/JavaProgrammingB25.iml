package day49_Collections;

import java.util.*;

public class Task_1 {


    public static void main(String[] args) {
        String str = "aaaabbbbccccdddeeeee";

        String result="";
      for ( String each:    new LinkedHashSet<>(Arrays.asList(str.split("")))) {
          result += each + Collections.frequency(Arrays.asList(str.split("")), each);


      }
        System.out.println(result);



        Integer [] nums={2,3,4,2,3,2,3,4,2,3,4,7,2,4,2,3,6,5,3,4,5,3,4,5,3,4,534,6,3,2,2,2,3,4,4,3,4,2,2,2,2,2};



    }
}
