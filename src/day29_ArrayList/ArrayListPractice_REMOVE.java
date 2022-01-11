package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice_REMOVE {
    public static void main(String[] args) {

        String[] countries={"Turkey","United States","United Kingdom","Kenya","France","Germany"};

        ArrayList<String> newcountries=new ArrayList<>(Arrays.asList(countries));


         newcountries.removeIf(p->p.length()>=10);


         //converting to Array

       countries= newcountries.toArray(new String[0]);


        System.out.println(Arrays.toString(countries));













    }
}
