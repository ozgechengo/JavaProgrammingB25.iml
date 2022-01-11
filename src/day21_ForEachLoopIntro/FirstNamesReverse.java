package day21_ForEachLoopIntro;

import java.beans.beancontext.BeanContextChild;

public class FirstNamesReverse {
    public static void main(String[] args) {

        String[] names ={"Elif Yanar","Sinem Doner","Gunay Soner","Cihad Beler",
                "David Geler","James Heder","Aaron Tozer","Daniel Klein"};

         for (String each : names){

        String reversed ="";

        for (int i =each.length()-1; i>0; i--) {
            reversed += each.charAt(i);
        }
             System.out.println(reversed);

        } {



        }
    }
}
