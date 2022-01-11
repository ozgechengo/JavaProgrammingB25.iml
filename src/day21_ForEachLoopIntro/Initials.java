package day21_ForEachLoopIntro;

public class Initials {
    public static void main(String[] args) {

        String[] names ={"Elif Yanar","Sinem Doner","Gunay Soner","Cihad Beler",
                "David Geler","James Heder","Aaron Tozer","Daniel Klein"};

        for (String each : names) {
             String initial=each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);
            System.out.println(initial);
        }




    }
}
