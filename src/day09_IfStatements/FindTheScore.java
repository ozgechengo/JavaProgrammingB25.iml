package day09_IfStatements;

public class FindTheScore {
    public static void main(String[] args) {
            int score = 33;
            char grade; // A B C D F

            if (score >= 100 &&score >=90) {

             System.out.println("score is A");
            } else if (score >= 80 && score <= 89) {
             System.out.println("score is B");
            } else if (score >= 70 && score <= 79 ) {
             System.out.println("score is C");
            } else if (score >=60 && score <= 69){
            System.out.println("score is D");
            }else {
             System.out.println("score is F");
            }
            }


    }