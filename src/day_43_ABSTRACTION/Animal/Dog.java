package day_43_ABSTRACTION.Animal;

public class Dog extends Animal{


    public Dog( String color, int age) {
        super("Dog", color, age);
    }

    @Override
    public void eat() {
        System.out.println( getName()+" is eating dog food");
    }
}
