package day34_GarbageCollection_AccessModfiers;

public class AccessModifiers {

    public  static int  publicData=100;
    static  int defaultData=200;       // access modifier: default
    private static int privateData=200;


    public static void main(String[] args) {


        System.out.println(publicData);
        System.out.println(defaultData);
        System.out.println(privateData);
    }

}
