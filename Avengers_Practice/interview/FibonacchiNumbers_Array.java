package interview;


import java.util.Arrays;

public class FibonacchiNumbers_Array {


    public static void main(String[] args) {


    int number=6;

    int[] fibo= new int[number];

    fibo[0]=0;
    fibo[1]=1;

        for(int i=2;i<number;i++){
        fibo[i]=fibo[i-1]+fibo[i-2];
        //  fibo[2]=fibo[1] + fibo[0] = 1
        //  fibo[3]=fibo[2] + fibo[1] = 1+1=2

    }
        System.out.println(Arrays.toString(fibo));

}


}


/*



 */