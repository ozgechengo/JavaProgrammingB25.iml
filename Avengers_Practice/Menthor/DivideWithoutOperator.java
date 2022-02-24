package Menthor;

public class DivideWithoutOperator {


    public static void main(String[] args) {
        int a = 30;
        int b = 5;


        withoutOperator(a, b);


    }

    static int withoutOperator(int a, int b) {

        int count = 0;

        if(b==0){
            throw new RuntimeException("Your  denominator  can not be less than zero ");
        }

        while (a >= b) {
            a -= b;
            count++;
        }
        System.out.println(count + " with a reminder of  " + a);


        return count;
    }

}

/*
I will assume that  'a'   is bigger than  'b'   so  i am going

   to take out   'b'  till     'a'    becames   same or smaller than   'b'  .
    And than will count it every time I removed     ' b '.
    So ,
   at the end  i was able to find how many  'b' do we have in   'a'  .

   and if anything remains , its going to be my  remainder.
 */


