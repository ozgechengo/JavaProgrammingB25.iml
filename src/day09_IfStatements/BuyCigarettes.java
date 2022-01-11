package day09_IfStatements;

public class BuyCigarettes {
    public static void main(String[] args) {
        byte age = 19;

        boolean isEligible = age >= 18;


        if (isEligible) {
            System.out.println("If he can buy cigarettes  " + isEligible);


        }
    }

}