package Menthor;

public class divisibleExamlpe {

    public static void main(String[] args) {
        divisible(150);


    }

    public static void divisible(int num) {

        String divisibleby15 = " ";
        String divisibleby5 = " ";
        String divisibleby3 = " ";

        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {
                divisibleby15 += i + " ";
            } else if (i % 5 == 0 && i % 15 != 0) {
                divisibleby5 += i + " ";
            } else if (i % 3 == 0 && i % 15 != 0) {
                divisibleby3 += i + " ";

            }
        }
        System.out.println("Divisible by 15 " + divisibleby15);
        System.out.println("Divisible by 5 " + divisibleby5);
        System.out.println("Divisible by 3 " + divisibleby3);
    }


}



