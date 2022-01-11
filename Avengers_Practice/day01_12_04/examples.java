package day01_12_04;


import utilities.ArraysUtility;
import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class examples {

    public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel) {


        int rT = 0;

        for (Integer each : deliveries) {

               rT += each / max_fuel;

            if (each % max_fuel != 0) {
                      rT += 1;

            }


        }


        return rT;


    }


    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int fuel = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(refuel_times(list, fuel));

    }

}