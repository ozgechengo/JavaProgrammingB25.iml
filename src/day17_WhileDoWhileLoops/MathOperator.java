package day17_WhileDoWhileLoops;

import java.util.Scanner;

public class MathOperator {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int  num1 =input.nextInt();

        Scanner input2 =new Scanner(System.in);
        System.out.println("ENTER SECOND NUMBER");
        int num2 =input2.nextInt();

        Scanner input3= new Scanner(System.in);
        System.out.println("ENTER VALID OPERATOR");
        String opr =input3.next();

         int total=0;

        while(! (opr.equals("+") || opr.equals("*") ||opr.equals("/") ||opr.equals("-"))){ // if the operator is invalid
            System.err.println("Invalid Operator, Please re-enter");
           break;
        }



        if(num1>=0 && num2>=0&& num2 >num1 ){
             if(opr.equals("+")){
                 total=num1+num2;
                 System.out.println(total);
             }else if(opr.equals("-")){
                 total=num2-num1;
                 System.out.println(total);}
             else if(opr.equals("*")){
                 total=num1*num2;
                 System.out.println();}
             else if(opr.equals("/")){
                 total=num2/num1;
                 System.out.println(total);}
             else {
                 System.out.println("INVALID");}}
             else if(num1>=0 && num2>=0&& num2 <num1 ){
             if(opr.equals("+")){
                 total=num1+num2;
                 System.out.println(total);
             }else if(opr.equals("-")){
                 total=num1-num2;
                 System.out.println(total);}
             else if(opr.equals("*")){
                 total=num1*num2;
                 System.out.println();}
             else if(opr.equals("/")){
                 total=num1/num2;
                 System.out.println(total);}
             else {
                 System.out.println("INVALID");}}

         }




    }

