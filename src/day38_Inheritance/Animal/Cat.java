package day38_Inheritance.Animal;

public class Cat extends Animal{


    public Cat(String name, String breed, String color, int age, char gender, char size) {
        super(name, breed, color, age, gender, size);
    }



    @Override
    public void eat() {
        System.out.println(name+breed+" eats cat food");

    }
}
