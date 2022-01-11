package day11_Switch_Scanner;

public class GradeLevelWithSwitch {
    public static void main(String[] args) {
         byte gradeLevel = 19;
         String text = "" ;

         switch (gradeLevel){
             case 1: case 2: case 3: case 4 :case 5:
                 text="Elementary";
                 break;
             case 6: case 7: case 8 : case 9:
                 text="Middle";
                 break;
             case 10: case 11 : case 12:
                 text="High School";
                 break;
             case 13: case 14 : case 15: case 16 :
                 text="COLLAGE";
                 break;
             case 17: case 18 :
                 text="GRADUATE";
                 break;
             default:
                 text= "INVALID AGE REFERANCE";

         }

        System.out.println(text);

    }



}



/*
1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            Note:
                Solution 1: Use switch statement
                Solution 2: use if & switch both

 */