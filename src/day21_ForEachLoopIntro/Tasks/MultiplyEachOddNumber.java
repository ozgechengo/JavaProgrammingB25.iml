package day21_ForEachLoopIntro.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

  public class MultiplyEachOddNumber {

        public static void main(String[] args) {



        ArrayList<Integer> list=new ArrayList<Integer>();

         list.addAll(Arrays.asList(1,2,3,4,5));

            for (int i = 0; i < list.size(); i++) {    //get all numbers

                if(list.get(i)%2!=0){                   // check if its odd .of its odd ,

                list.set(i,list.get(i)*2); }}            //  change i with the one you multiplied .






         System.out.println(list);

   }}



