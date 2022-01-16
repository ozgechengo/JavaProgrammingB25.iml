package tasks_day38.Animal;

public class Crocodile extends WildAnimal {


    public Crocodile(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting fishes");
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating small frogs");
    }
}