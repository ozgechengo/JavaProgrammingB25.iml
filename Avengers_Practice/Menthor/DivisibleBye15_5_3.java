package Menthor;



public class DivisibleBye15_5_3 {
    public static void main(String[] args) {

      divisibleBy_3_5_15(100);
    }
    public static void divisibleBy_3_5_15(int num){
        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";

        for (int i = 1; i <=num ; i++) {
            if(i%3==0 && i% 5==0 && i %15==0){
                divisibleBy15 += i+ " ";
            }else if(i%5==0 && i%15!=0){
                divisibleBy5 += i+ " ";
            }else if(i%3==0 && i%15!=0){
                divisibleBy3 += i+" ";
            }
        }
        System.out.println("Divisible by 15 "+ divisibleBy15);
        System.out.println("Divisible by 5 "+ divisibleBy5);
        System.out.println("Divisible by 3 "+ divisibleBy3);
    }


}
