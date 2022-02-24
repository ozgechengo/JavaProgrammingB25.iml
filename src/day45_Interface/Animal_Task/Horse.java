package day45_Interface.Animal_Task;

public final class Horse extends Animal implements Playable {


    public Horse(String breed, String name, String color, String size, char gender, int age) {
        super(breed, name, color, size, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats hay ! ");

    }

    @Override
    public void play() {
        System.out.println(getName() + " loves to play with humans ");

    }

    public String toString() {
        return getClass().getSimpleName() +
                "breed='" + getBreed() + '\'' +
                ", name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", size='" + getSize() + '\'' +
                ", gender=" + getGender() +
                ", can play " + abletoPlay +
                ", age=" + getAge() +
                '}';


    }
}