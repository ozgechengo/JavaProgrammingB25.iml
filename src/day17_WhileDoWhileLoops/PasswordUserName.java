package day17_WhileDoWhileLoops;

import java.util.Scanner;

public class PasswordUserName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your username: ");
        String UserName = scan.nextLine();
        System.out.println("enter your password: ");
        String Password = scan.nextLine();


        for (int i = 1; i <=3 ; i++) {
            if (UserName.equals("Cydeo") && Password.equals("Cydeo123")) {
                System.out.println("you loged in");
                break;
            } else {
                System.err.println("invalid username or password");
                System.out.println("please re-enter your username: ");
                UserName = scan.nextLine();
                System.out.println("please re-enter your password: ");
                Password = scan.nextLine();
            }
            if (i == 3) {
                System.out.println("your account locked");
            }
        }

    }

}
