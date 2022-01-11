package day09_IfStatements;

public class WhichSchool2 {

    public static void main(String[] args) {

            byte age = 1;

            if (age < 5) {
                System.out.println("Not School Age");
            }
            else if    (age >= 5 && age <= 9  ){
                System.out.println("Elementary");
            } else if (age >= 10 && age  <= 13) {
                System.out.println("MiddleSchool");
            } else if (age >= 14 && age  <= 18){
                System.out.println("HighSchool");
            } else if (age >= 19 && age  <= 22){
                System.out.println("Collage");
            }else{
                System.out.println("Has Graduated");
            }







        }

    }

