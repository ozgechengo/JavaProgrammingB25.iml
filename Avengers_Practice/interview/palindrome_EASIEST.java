package interview;

public class palindrome_EASIEST {
    public static void main(String[] args) {

        String str="race";
        String  reverse="";

        for (int i =str.length()-1; i >=0 ; i--) {
             reverse+=str.charAt(i);


        }
           boolean isPalindrome = str.equalsIgnoreCase(reverse);
        System.out.println(isPalindrome);
          }


    }

