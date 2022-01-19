package interview;

public class StrongPassword {


    public static void main(String[] args) {

        String password="Cydeo25@";

        boolean r1=password.length()>=8 && !password.contains(" "); //has password
        boolean r2=false;//has upper case
        boolean r3=false;//has lower case
        boolean r4=false;//has special char
        boolean r5=false;//has digit

        for (int i=0;i<password.length();i++) {

            char each=password.charAt(i);

            if(Character.isUpperCase(each)){
                r2=true;
            }else if(Character.isLowerCase(each)){
                r3=true;
            }else if(Character.isDigit(each)){
                r4=true;
            }else{
                r5=true;
            }
        }

        boolean isStrongPassword= r1 && r2 && r3 && r4 && r5;

        System.out.println(isStrongPassword);

    }
}


/*
1.Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
        1.1 Password must be at least have 8 characters long, and should not contain space
        1.2 PassWord should at least contain one upper case letter
        1.3 PassWord should at least contain one lower case letter
        1.4 Password should at least contain one special characters
        1.5 Password should at least contain a digit

 */