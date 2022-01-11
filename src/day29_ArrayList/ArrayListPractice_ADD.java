package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice_ADD {
    public static void main(String[] args) {

        String[]names={"MEHMET","MURAT","MUSTAFA","Ali","Ahmet","David","Jimmy","Daniel","Aaron","David","Ahmet","Shay"};

        ArrayList<String> list=new ArrayList<>(Arrays.asList(names));

        list.removeIf(p->p.charAt(0)=='M');     // NAMES WHICH STARTS WITH M

        names= list.toArray(new String[0]);   // convert back to ARRAY !!!!


        System.out.println(Arrays.toString(names));






    }
}
