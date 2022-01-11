package day01_082022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test26 {

    public static void main(String[] args) {

      //  Scanner in=new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(4,1,8,-42,2,10));

          int run =6;

        while (run > 0) {


         run--;
            switch (8) {
                case 1:
                    nums.add(1);
                case 5:
                    nums.add(50);
                    break;
                case 4:
                    break;
                case 8:
                 nums.remove(0);
                    break;
                case 10:
                case -1:
                case -42:

                nums.add(1,0);
                break;
                case 2:
                    nums.add((20000));
                    break;
                default:
                    nums.add(null);


        }
        System.out.println(nums);
    }}}