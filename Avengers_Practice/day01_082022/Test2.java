package day01_082022;

import java.util.Scanner;

public class Test2 {
    public static int action(){

        return 0;
    }

    public static int action(int i){
        return i*2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        total += action(input.nextBoolean());  //10
        total += action(input.nextInt());   // 12
        total += action();                //0
        total += action(input.next());    //5
        total += action(input.next());    //4

        System.out.println(total);

    }
    public static int action(String s){
        return s.length();

    }
    public static int action(boolean b){

        if(!b){
            return 5 ;
        }else {
            return 10;
        }
    }
}
