package day01_12_04;

import java.util.ArrayList;
import java.util.Scanner;

public class denemeler3 {

    public static void main(String[] args) {
        String name = "ozd ge";

        char [] chars=name.toCharArray();

        for (char each : chars) {
            if (Character.isDigit(each)) {
                System.out.println(" ERROR !! ");
                System.exit(1);}
           if(!Character.isLetter(each)){
                if(!(each ==' ')) {
                    System.err.println("Invalid entry");
                    System.exit(1);
                }}}
        System.out.println(name);


    }}