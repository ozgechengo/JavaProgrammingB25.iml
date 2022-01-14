package day38_Inheritance.Animal;

public class Eagle extends Animal{

    public Eagle( String name, String breed, String color, int age, char gender, char size) {
        super(name, breed, color, age, gender, size);
    }

    @Override
    public void eat() {
        System.out.println(breed+name+" eats  snake");
    }
}
