package day21_ForEachLoopIntro;

public class classtask {
    public static void main(String[] args) {
        String []names={"Aaron","James","Oliver","Junior"};
        for (String person : names) {
            System.out.println(person);   }
        for (int i= 0;  i<names.length ; i++) {
            System.out.println(names[i]);

        }
    }
}
