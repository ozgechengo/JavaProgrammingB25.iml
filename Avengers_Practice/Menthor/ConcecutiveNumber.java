package Menthor;

public class ConcecutiveNumber {

    public static void main(String[] args) {
        consecutiveNumbers(35);

    }
    public static void consecutiveNumbers(int num) {
        String result = "";

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                result += "CodilityTestCoders\n";
            } else if (i % 2 == 0 && i % 3 == 0) {
                result += "CodilityTest\n";
            } else if (i % 2 == 0 && i % 5 == 0) {
                result += "CodilityCoders\n";
            } else if (i % 3 == 0 && i % 5 == 0) {
                result += "TestCoders\n";
            }if (i % 2 == 0) {
                result += "Codility\n";
            } else if (i % 3 == 0) {
                result += "Test\n";
            } else if (i % 5 == 0) {
                result = "Coders\n";
            } else {
                result += i + "\n";
            }
        }
        System.out.println(result);
    }
}
