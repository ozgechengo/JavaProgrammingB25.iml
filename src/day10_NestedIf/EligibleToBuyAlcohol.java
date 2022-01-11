package day10_NestedIf;

public class EligibleToBuyAlcohol {
    public static void main(String[] args) {

        int age = 19;
        boolean hasId = true;

        if(hasId){ // if the person has an ID

            if(age>= 21){ // if the person is 21 years old or older
                System.out.println("Eligible to buy alcohol");
            }else{ // if the person is less than 21 years old
                System.out.println("Not eligible to buy alcohol");
            }

        }else{ // if the person does not have an ID
            System.out.println("You must have an ID to buy alcohol");
        }







    }




}
