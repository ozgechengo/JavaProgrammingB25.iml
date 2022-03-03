package Menthor;

public class ReverseNegativeNumber {


    public static void main(String[] args) {

        System.out.println(reverseNegativeNum(-139));


    }

    public static String reverseNegativeNum(int num ){ //-987

        if(num>0){
            throw new RuntimeException("Num should be negative");
        }

        String str=""+num;
        String result="";

        for (int i=str.length()-1;i>0;i--){
            result+=str.charAt(i);
        }


        return "-"+result;

    }

}
