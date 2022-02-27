package Menthor;

public class deneme {

    public static void main(String[] args) {


        String a = "", b = "", c = "";

        for (int i = 0; i < 100; i++) {
            if (i % 15 == 0) {
                a += " " + i;
            } else if (i % 5 == 0) {
                b += " " + i;
            } else if (i % 3 == 0) {
                c += " " + i;
            }
        }
        System.out.println("Divisible By 15: " + a + "\n" + "Divisible By 5: " + b + "\n" + "Divisible By 3: " + c);
    }
}