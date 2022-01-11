package day01_082022;

public class calismalar {
    public static void main(String[] args) {

       String str1="asdasdasdasddadfsdfsd";
        int count=0;
        for (int i = 0; i <str1.length() ; i++) {
            String ch=""+str1.charAt(i);
            for (int j = 0; j <str1.length() ; j++) {
                 if (ch.equals(str1.charAt(j))) {

                         count++;
                      if(count==1){

              System.out.println(ch);
          }



    }}}}}
