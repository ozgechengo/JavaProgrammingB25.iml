package day18_WhileLoops;

public class SquareWithNumbers {
    public static void main(String[] args) {

        int frequency=0;
        for (int i = 1; i <11; i++) {
            for (int j = 1; j <11 ; j++) {
                frequency++;

                System.out.print("  " + i * j +" ");

            }
                System.out.println();
            }

        }


    }
