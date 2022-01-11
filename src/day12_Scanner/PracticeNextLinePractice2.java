package day12_Scanner;

import java.util.Scanner;

public class PracticeNextLinePractice2 {

        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);

            System.out.println("Hou old are you?");
            int age= input.nextInt();

            System.out.println("What is your full name?");
            input.nextLine();
            String name=input.nextLine();

            System.out.println("age = " + age);
            System.out.println("name = " + name);

        }
    }



