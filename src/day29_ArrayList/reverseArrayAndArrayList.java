package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class reverseArrayAndArrayList {
    public static void main(String[] args) {


        int[ ]arry={1,2,3,4,5,6};


        int [] result=new int[arry.length];
         int j=0;

        for (int i = arry.length - 1; i >= 0; i--,j++) {
            result[j]=arry[i];
        }
        System.out.println(Arrays.toString(result));

        System.out.println("------------------------------------------------------");

        ArrayList<Integer> list=new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        ArrayList<Integer>reversedList=new ArrayList<>();  //
        for (int i = list.size() - 1; i >= 0; i--) {
              int each=list.get(i);
              reversedList.add(each);


        }
        System.out.println(reversedList);

    }
}
