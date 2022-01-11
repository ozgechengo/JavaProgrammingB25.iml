package day21_ForEachLoopIntro.Tasks;

public class reverse {
    public static void main(String[] args) {
        String str = "Level";
        boolean isPalindrome=reverse(str);
        System.out.println(isPalindrome);
    }



    public static boolean reverse(String word) {

         String result="";
        for (int j =word.length()-1; j >= 0; j--) {
                result+=word.charAt(j);
        }
        boolean isPalindrome=word.equalsIgnoreCase(result);
        return isPalindrome;
    }
}