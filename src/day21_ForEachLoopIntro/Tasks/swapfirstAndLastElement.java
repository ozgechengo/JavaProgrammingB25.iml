package day21_ForEachLoopIntro.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class swapfirstAndLastElement {
    public static void main(String[] args) {
         ArrayList<Integer> list=new ArrayList<Integer>();

         list.addAll(Arrays.asList(1,2,3,4,5));


        int tmp=list.get(0);                   // temporary   var.Assign first element to temp.

        list.set(0,list.get(list.size()-1));  //swap it with set .change  element zero with 4th


        list.set(list.size()-1,tmp);         //and change last element  with temp


         System.out.println(list);






    }
}
