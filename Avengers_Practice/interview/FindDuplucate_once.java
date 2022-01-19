package interview;

public class FindDuplucate_once {

    public static void main(String[] args) {


        String str = "aabbaccxhhhhhjjddk";

        String result = "";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                char each = str.charAt(j);
                if (each == ch) {
                    count++;
                }
            }
            if (count > 1 && !result.contains(ch+"") ) {
                result += ch;
            }
        }


            System.out.print(result);
        }
    }
// "aabbaccxhhhhhjjddk";
// abchjd


// String icinde  her harfi 1 kere yazdir .