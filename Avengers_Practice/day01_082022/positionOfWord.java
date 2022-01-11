package day01_082022;

 public class positionOfWord {

    public static void main(String[] args) {


        String sentence="Java is my job and because i am SDET  ";
        String word="Sdet";

         int position=findIndex(sentence,word);
        System.out.println(position);


        }

     private static int findIndex(String sentence, String word) {
         String[] strings = sentence.split(" ");

         int counter=0;


         for (String each : strings) {
             counter++;
             if (each.equals(word)){
                 break;
         }
         }



         return counter;
     }


 }