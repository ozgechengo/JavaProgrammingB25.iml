package day01_082022;

public class intdeneme {

    public static void main(String[] args) {


    String str = "aabbaccxjjddk";

    String result = "";


        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if (each == ch) {
                    continue;
                }
                result += ch;
            }
        }
                   System.out.println(result);
            }
        }
