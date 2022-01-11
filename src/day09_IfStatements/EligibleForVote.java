package day09_IfStatements;

public class EligibleForVote {
    public static void main(String[] args) {

        String     name = "Josh";
        int        age  = 11;
        String  citizen = "USA";

        if(age >= 21 && citizen == "USA"){
            System.out.println("Eligible");
        }

        else {
            System.out.println("Not Eligible");
        }






    }}
