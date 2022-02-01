package day_43_ABSTRACTION.Animal;

public class AnimalObject {
    public static void main(String[] args) {


        Tiger tiger = new Tiger("Black", 3);
        Dog dog = new Dog("black", 2);
        Cat cat = new Cat("white", 4);

        tiger.eat();
        dog.eat();
        cat.eat();


        System.out.println(cat);
        System.out.println(dog);
        System.out.println(dog);

    }}
