package day01_12_04;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class howmanypalindroms {
    public static void main(String[] args) {

        ArrayList<Integer> numbers =new ArrayList<>();
        ArrayList<String>  names=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5));
        names.addAll(Arrays.asList("ozge","ayse","fatma","arzu"));
        numbers.addAll(Arrays.asList(2,3,4,5,6));
        int lastIndex=numbers.size( )-1;
        System.out.println(numbers);
        System.out.println(lastIndex);
        String name2= "arzu";
        Boolean r2=names.remove(name2);


        System.out.println(r2);


    }}


