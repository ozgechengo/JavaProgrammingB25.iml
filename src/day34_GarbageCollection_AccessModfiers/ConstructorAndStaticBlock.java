package day34_GarbageCollection_AccessModfiers;

public class ConstructorAndStaticBlock {

    static{
        System.out.println("Static Block");
    }

    public ConstructorAndStaticBlock (){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        new ConstructorAndStaticBlock (); //1
        new ConstructorAndStaticBlock (); //1
        new ConstructorAndStaticBlock (); //1
        new ConstructorAndStaticBlock (); //1
        new ConstructorAndStaticBlock (); //1
        new ConstructorAndStaticBlock (); //1


    }


}
