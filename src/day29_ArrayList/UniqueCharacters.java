package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {



        String str ="aaabbbcccdddeee";



        ArrayList <String> list=new ArrayList<>(Arrays.asList(str.split("")));   // once array e cevir


        System.out.println(list);

       String unique="";

        for (String each : list) {
            int freq= Collections.frequency(list,each);  //  collection class la freq bul
            if(freq==1){
              unique+=each;    //  each i unuqe  ekle

               } }


        System.out.println(unique);
    }}

