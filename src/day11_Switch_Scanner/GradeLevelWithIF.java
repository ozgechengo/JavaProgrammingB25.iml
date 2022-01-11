package day11_Switch_Scanner;

public class GradeLevelWithIF {
    public static void main(String[] args) {
        int age = 56;
        String schoolLevel = "";

        if (age >= 1 && age <= 18) {
            if (age > 1 && age <= 5) {
                schoolLevel = ("Elementary");
            }else if (age >= 6 && age <= 8) {
                schoolLevel = ("Middle School");
            }else if (age >= 9 && age <= 12)
            {
                schoolLevel = ("High Scool");
            } else if (age >= 13 && age <= 16) {
            schoolLevel = ("Collage");
            }else {
          schoolLevel= ("GRADUATED");}
        }
     else{
          schoolLevel=("INVALID");}
            System.out.println(schoolLevel);

        }}


/*
                1-5: Elementary school
                6-8: Middle school
                9-12: High school
                13-16: College
                17-18: Grad School*/