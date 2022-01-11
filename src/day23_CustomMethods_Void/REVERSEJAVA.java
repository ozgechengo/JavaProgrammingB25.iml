package day23_CustomMethods_Void;

public class REVERSEJAVA {
    public static void main(String[] args) {


    String str ="java";
    String  result="";

        for (int i = str.length() - 1; i >= 0; i--) { //i: index numbers of str (starting last index to index 0 )
        result += str.charAt(i);
    }
             System.out.println(result);
}
}
