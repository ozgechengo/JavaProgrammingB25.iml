package day10_NestedIf;

public class ChacacterIdentity {
    public static void main(String[] args) {

                char ch = 1;

                if(ch >= 48 && ch <= 57) {
                    System.out.println("Digit");
                }else if( (ch >= 65 && ch <= 90)  || (ch >= 97 && ch <= 122)  ) {
                    System.out.println("Alphabetic");
                }else {
                    System.out.println("Special character");
                }





            }

        }