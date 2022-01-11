package day01_JavaIntro;


import utilities.ArraysUtility;

public class test2 {
    public static void main(String[] args) {

        int[]arr1={1,2,3,4,5,6};
        ArraysUtility.printEachElement(arr1);
        System.out.println("----------------------------------------------------------------");

        char[]arr2={'A','B','C','D'};
        ArraysUtility.printEachElement(arr2);

        System.out.println("----------------------------------------------------------------");

        double[]arr3={1.4,2.6,3.8,4.9,5.3,6.5};
        ArraysUtility.printEachElement(arr3);

        System.out.println("----------------------------------------------------------------");

        String []arr4={"ozge","cihan","berk","burak"};
        ArraysUtility.printEachElement(arr4);

        System.out.println("--------------------------------------------------------------------");

           int []n1={1,2,3,4,5,6};
           int max1=ArraysUtility.max(n1);
        System.out.println(max1);
        System.out.println("---------------------------------------------");

        double []n2={1.5, 2.6 ,7.4 ,4.5 ,5.6 ,6.7 };
        double max2=ArraysUtility.max(n2);
        System.out.println(max2);


        System.out.println("--------------------------------");


        int[] a1 = {1,2,3,4,5,6,7};

        boolean r1 = ArraysUtility.contains(a1, 10);

        System.out.println("r1 = " + r1);



    }

}


