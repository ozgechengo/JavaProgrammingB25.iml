package day01_082022;

public class findFrequencyOfChangingPlace {
    public static void main(String[] args) {


    int [] array={1,1,1,0,1,0};
    int countZeros=0;
    int countOnes=0;
    int moves=0;

        for (int i : array) {
            if(i==1){
                countOnes++;
            }else {
                countZeros++;
            }}
          if (countOnes<countZeros){
              System.out.println((countZeros-countOnes)/2);
          }else if(countZeros<countOnes){
              System.out.println((countOnes-countZeros)/2);
          }


        System.out.println("countOnes"+countOnes);
        System.out.println("countZeros"+countZeros);




}}
