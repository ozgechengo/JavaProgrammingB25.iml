package tasks_day38.Animal;

public class Bear extends WildAnimal{
    public Bear(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void hunt() {
        System.out.println(" is hunting forest animals");
    }

    @Override
    public void eat() {
        System.out.println(" is eating honey from jar");
    }

    @Override
    public void move() {
        System.out.println(" is moving so slow");
    }
}