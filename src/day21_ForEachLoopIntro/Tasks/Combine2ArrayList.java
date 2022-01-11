package day21_ForEachLoopIntro.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Combine2ArrayList {
    public static void main(String[] args) {

        String [] arr1={"A","B","C"};
        String [] arr2={"D","E","F","G"};


        ArrayList<String>list=new ArrayList<>();

        for (String each :arr1) {    // get all elements.
             list.add(each); }        //add each of them to new list.
        for (String each: arr2) {     //get all elements.
            list.add(each); }         //add each of tmen to new list.
        System.out.println(list);     //print.




    }
}
