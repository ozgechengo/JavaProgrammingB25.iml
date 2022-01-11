package day09_IfStatements;

public class WhichSchool {
    public static void main(String[] args) {
               int age =15 ;
        boolean elementary   = age >= 1 && age  <= 5;
        boolean middleSchool = age >= 6 && age  <= 8;
        boolean highSchool   = age >= 9 && age  <= 12;
        boolean collage      = age >= 13 && age <= 16;
        boolean hasGraduated = age >= 17 && age <= 18;


         if( elementary) {
            System.out.println("Elementary");
        }
        if(middleSchool){

             System.out.println("MiddleSchool");
        }if (highSchool){
            System.out.println("HighSchool");
        }

        if (collage){
            System.out.println("Collage");
        }
        if (hasGraduated){
            System.out.println("Has Graduated");
        }







    }

}
