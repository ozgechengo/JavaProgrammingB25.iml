package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray2 {
    public static void main(String[] args) {
        int[][] arr2D = { {1,2,3} , {4,5,6,7}, {8,9,10,11,12,13}  };


   //     System.out.println(Arrays.toString(arr2D));
        for(int i =arr2D.length-1 ; i >=0 ; i--) {

            for (int j = 0 ;j <arr2D[i].length;j++ ) {

                System.out.print(arr2D[i][j]+"");

            }

            System.out.println();

        }


    }
}
