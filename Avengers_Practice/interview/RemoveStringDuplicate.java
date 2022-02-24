package interview;

public class RemoveStringDuplicate {

    public static void main(String[] args) {

          String str="asdajdlkjkjlkasdjaslkasdaszda";

        System.out.println(removeStringDuplicate(str));

    }


      public static String removeStringDuplicate(String str){


         String  result="";

          for (int i = 0; i <str.length() ; i++) {
              if(!(result.contains(str.charAt(i)+""))){
                  result+=str.charAt(i);

              }
          }



          return result;
      }

}
///*
// Write a program that can remove the duplicated characters from a String
//            Ex:
//                input:
//                    ABBCCBC
//
//                Output:
//                    ABC
//
//            Hint: You can add each characters of the string into another String
//                  Condition: the character is not contained in the other String yet before you are adding
//
// */

