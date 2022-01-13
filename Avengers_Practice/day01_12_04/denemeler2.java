package day01_12_04;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class denemeler2 {
    public static void main(String[] args){

       // String strs = "duduklu tencere,tencere kapagi,osuruk agaci,flut,kopu,anne terligi,meeting,copy,franchise";

        String[] str={"ozge","burak","berk"};
        String [] str2={"ozge","burak","berk"};


        ArrayList<String> grosery=new ArrayList<>();
        ArrayList<Integer> grosery2=new ArrayList<>();

      grosery.addAll(Arrays.asList("Apple","armyt","muz","ekmek"));
      grosery2.addAll(Arrays.asList(1,1,2,4,6,7,8,9,3,34,34,232,3121,35,46,546));
        Collections.reverse(grosery);
      //  grosery.remove(3);
        //  //grosery.remove("Apple");


       System.out.println(grosery);
       System.out.println(grosery);




        System.out.println(Arrays.toString(str));



    }}