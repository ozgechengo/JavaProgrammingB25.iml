package day10_NestedIf;

public class SchoolGrades {
    public static void main(String[] args) {
                   int score = 95;

        if(score >= 0 && score <= 100){ // if the score is valid
            // 5 possibilities: A, B, C, D, F
            if(score>= 90 ){ //false:  score < 90
                System.out.println("Excellent");
            }else if(score >= 80 ){ // false: score < 80
                System.out.println("Great");
            }else if(score >= 70){ // false: score < 70
                System.out.println("Good");
            }else if(score >= 60){// false: score < 60
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }

        }else{ // if the score is NOT valid
            System.out.println("Invalid Score");
        }




    }

}






