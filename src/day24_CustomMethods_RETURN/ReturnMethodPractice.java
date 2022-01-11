package day24_CustomMethods_RETURN;

public class ReturnMethodPractice {
    public static void main(String[] args) {
        int maxnum=maxnum(100,200);
        int multipkication=maxnum*2;
        System.out.println(maxnum);
        System.out.println(multipkication);
    }

    public static int  maxnum(int num1,int num2 ) {

        int result = 0;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }


        return result;
    }}