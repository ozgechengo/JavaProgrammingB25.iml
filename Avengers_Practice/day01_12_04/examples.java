package day01_12_04;


import utilities.ArraysUtility;
import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class examples {

    public static void main(String[] args) {
        String [] cities = {"Boston", "Houston", "Austin", "lincoln", "Tulsa"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(cities));
        int a = list.size();

        for (String str: list) {
            String rev = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                rev += str.charAt(i);
            }

            list.set(--a, rev);}
            System.out.println(list);
        }

        //{"Boston", "Houston", "Austin", "Lincoln", "Tulsa"}; list
        //{"     " , "       " ,"      " , "     "  , "     " }  rev


        //{"     " , "       " ,"      " , "     "  , "notsoB" }  rev
        //{"Boston", "Houston", "Austin", "Lincoln", "notsoB"}; list


         // {"     " , "       " ,"      " , "notsuoH", "notsoB" }  rev
        //{"Boston", "Houston", "Austin", "notsuoH", "notsoB"}; list


           //{"Boston", "Houston","nitsuA" , "notsuoH " , "notsoB" }; list
        // {"     " , "       " ,"nitsuA" , "notsuoH " , "notsoB" }  rev



                                          //simdi Houston a  geldi ters oldugu icin duzeltip atiyor
        //{"Boston", "Houston","nitsuA" , "notsuoH " , "notsoB" }; list
        // {"     " , " Houston " ,"nitsuA" , "notsuoH " , "notsoB" }  rev

                                                       //Simdi bu Boston a geldi. ters oldugu icin duzeltip atiyor.
        //{"Boston", "Houston","nitsuA" , "notsuoH " , "notsoB" }; list
       // {"Boston" , " Houston " ,"nitsuA" , "notsuoH " , "notsoB" }  rev





}



//{"Boston", "Houston", "Austin", "lincoln", "Tulsa"};
//{"Boston" ,"Houston", "Austin", "lincoln", "nostoB",};