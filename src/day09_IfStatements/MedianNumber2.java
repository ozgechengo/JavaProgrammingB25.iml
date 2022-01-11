package day09_IfStatements;

public class MedianNumber2 {
    public static void main(String[] args) {
        int     a = 5,
                b = 10,
                c = 15;
        String  medianNumber ;


        if ((a<b&&a>c ) ||(a>b&&a<c) ){
            System.out.println(a + " is the median number");
        }
        else if ((b<a&&b>c) || (b>a&&b<c)) {
            System.out.println(b + " is the median number");
        }
        else {
            System.out.println(c+ " is the median number");
        }

    }
}


