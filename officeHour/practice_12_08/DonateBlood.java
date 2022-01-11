package practice_12_08;


import day11_Switch_Scanner.ScannerIntro;

import java.util.Scanner;

public class DonateBlood {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("PLEASE ENTER YOUR AGE");
        int age =input.nextInt();
        System.out.println("PLEASE ENTER YOUR WEIGHT");
        double weight=input.nextDouble();

/*
        if(age>18){
            if(weight>50){
                System.out.println("YOU ARE ELIGIBLE FOR BLOOD DONATION");
            }else {
                System.out.println("YOUR   NOT ELIGIBLE FOR DONATION");
            }
        }else {
            System.out.println("AGE MUST BE OVER 18");
        }
    }}
*/
        String result = (age > 18)?(weight>50)?"YOU ARE ELIGIBLE FOR BLOOD DONATION":
                                                "YOUR   NOT ELIGIBLE FOR DONATION":
                                                      "AGE MUST BE OVER 18";
        System.out.println(result);
        }
    }