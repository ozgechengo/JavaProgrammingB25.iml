package day08_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
        int score = 85;

        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && score <= 89; //   or && !a ;                 da olabilir.
        boolean c = score >= 70 && score <= 79;  //  or && !a && !b             da olabilir.
        boolean d = score >= 60 && score <= 69;  //  or && !a && !b && c        da olabilir.
        boolean f = score >= 0 && score <= 59;  //  or &  !a && !c && c  && d  da olabilir.


        if (a) {    // If the student made an A
            System.out.println("Excellent");
        }


        if (b) {   // If  the student made a B
            System.out.println("Great");
        }

        if (c) {   // If  the student made a  C

            System.out.println("Good");
        }

        if (d) {   // If  the student made a D

        System.out.println("Passed");
    }


        if(f) {   // If  the student made a B


            System.out.println("Failed");
        }













    }
}
