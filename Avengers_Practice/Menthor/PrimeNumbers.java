package Menthor;

public class PrimeNumbers {



        public static void main(String[] args) {

            System.out.println(isNumPrime(4));

        }
        public static boolean isNumPrime(int num){
            // Prime number are : 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29.
           //  Prime numbers  means only divisible by itself and  1  and , which is bigger than 1 .

            if (num<2){   //   so we start from  2
                return   false;
            }
            for (int i = 2; i < num ; i++) { // number starts from 2 and check all numbers till it comes itself.

                if (num % i ==0){            // if it founds any number can be divided by , so it means its not a prime number.
                    return false;           // and it returns false
                }
            }
            return true;                       // the rest is  Prime number
        }

    }
