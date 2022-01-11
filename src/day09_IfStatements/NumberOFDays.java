package day09_IfStatements;

public class NumberOFDays {
    public static void main(String[] args) {
          int number = 8 ;



          if(number == 2){
            System.out.println("28 days");
        } else if(number == 4 || number == 6 || number ==9 || number == 11){
            System.out.println("30 days");
        } else {
            System.out.println("31 days");
        }
    }
}