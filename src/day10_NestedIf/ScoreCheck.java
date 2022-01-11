package day10_NestedIf;

public class ScoreCheck {
    public static void main(String[] args) {
        int score = 200;

        if(score>= 0 && score <= 100){ // if score is valid

            if (score >= 60) { // if student passed the exam
                System.out.println("Passed");
            }else { // if the student failed exam
                System.out.println("Failed");
            }


        }else{ //if the score is not valid
            System.out.println("Your entry is Invalid");
    }
}}
