package interview;

import java.util.Scanner;

public class FrequencyOfJava {



        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter sentence:");
            String word = scan.nextLine();// java  java
            word = word.toLowerCase();


            int count = 0;

            for (int i = 0; i < word.length()-3; i++) { //i=0 java j
                String java = word.substring(i, i + 4);//i=0 -> java, i=1-> ava ,i=2 va  ,

                if (java.equals("java")) {
                    count++; //1
                }


            }
            System.out.println(count);

            scan.close();


        }


    }
/*
write a program that can return the frequency of the a word Java from
the sentence
Ex:
sentence = "Java Java";
output:
2
 */
