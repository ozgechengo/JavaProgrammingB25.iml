package Menthor;

import utilities.MathUtility;

public class FinRa {
    public static void main(String[] args) {

        Finra();

    }

    public static void Finra() {


        for (int i = 1; i <= 30; i++) {

            if (i % 15 == 0) {   // this is the most specific one  thats why i got 15 at first

                System.out.println(  i+ " FINRA");
            } else if (i % 5 == 0) {

                System.out.println(i+ " RA");
            } else if (i % 3 == 0) {

                System.out.println(i+ " FIN");

            }else {
                System.out.println(i +" NONE  ");
            }

        }
    }
}