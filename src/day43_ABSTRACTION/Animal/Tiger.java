package day43_ABSTRACTION.Animal;

public class Tiger extends  Animal{

    public Tiger(  String color, int age) {
        super("Tiger", color, age);
    }

    @Override
    public void eat() {
        System.out.println( getName()+" is eating Zebra");
    }


}
