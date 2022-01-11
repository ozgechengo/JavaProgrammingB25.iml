package day10_NestedIf;

public class SchoolGrades2 {
    public static void main(String[] args) {
            int n=3;
            String result=(n>=0&&n<=100)?(n>=90)?"exellent":(n>=80)?"Great":(n>=70)?
                    "good":(n>=60)?"pass":"failed": "invalid number";
            System.out.println(result);
        }
    }



