package tasks_day38.Animal;

public class Eagle extends WildAnimal{
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void fly(){
        System.out.println(getName()+ " " +getColor()+ " is flying overhead");
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " " + " is eating snakes on the cactus");
    }


}
