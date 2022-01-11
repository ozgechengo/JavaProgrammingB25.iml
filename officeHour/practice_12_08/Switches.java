package practice_12_08;

import java.util.Scanner;

public class Switches {
    public static void main(String[] args) {
        Scanner  input= new Scanner(System.in);
        System.out.println("ENTER YOUR ANIMAL NAME");
        String animal =input.next();
          String result ="";
              switch (animal){

                  case "DOG":
                      result="domestic animal";
                      break;
                  case "CAT":
                      result="domestic animal";
                      break;
                  case "TIGER":
                      result="Wild";
                      break;
                  default:
                       result= "UNKNOWN ANIMAL";
              }

        System.out.println(result);

    }
}
