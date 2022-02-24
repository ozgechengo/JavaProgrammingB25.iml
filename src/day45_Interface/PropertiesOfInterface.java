package day45_Interface;

public  class PropertiesOfInterface {
    int a;
    static int b;
    public PropertiesOfInterface(int a){
        this.a=a;

    }
    static {
        b=100;
    }

    public void method1(){
        System.out.println("instance methode");
    }
    public static void method2(){
        System.out.println("static method");
    }

  //  public abstract void method3();
}
