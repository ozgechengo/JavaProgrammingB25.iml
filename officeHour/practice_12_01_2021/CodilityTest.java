package practice_12_01_2021;

public class CodilityTest {
    public static void main(String[] args) {


        int number =45  ;
        String result="";


        if (number % 2==0){
           result+=" Codility ";
        }else if(number % 3==0){
            result+=" Test ";
        }else if(number%5== 0 ) {
            result += " Coders ";
        }System.out.println(result);
        }


    }
