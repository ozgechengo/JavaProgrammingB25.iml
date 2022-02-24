package day43_ABSTRACTION.Animal;

public class Cat extends Animal {

    public Object meow;

    public Cat(String color, int age) {
        super("Cat", color, age);
    }

    @Override
    public void eat() {
        System.out.println( getName()+" is eating cat food");





    }
}

