package day01_12_04;

import java.util.ArrayList;
import java.util.Scanner;

public class denemeler3 {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int size = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i < size; i++) {
                list.add(in.nextInt());
            }


            int sum=0;
            for (int i=0;i<list.size();i++){
                sum+=list.get(i);
            }





            System.out.println(sum);

        }}
