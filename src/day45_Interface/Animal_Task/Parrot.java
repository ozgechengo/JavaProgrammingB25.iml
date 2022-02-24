package day45_Interface.Animal_Task;

public final class Parrot extends Animal implements  Playable ,Flyable {

    public Parrot(String breed, String name, String color, String size, char gender, int age) {
        super(breed, name, color, size, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() +" eats fish .");

    }

    @Override
    public void play() {
        System.out.println(getName() + " loves to play !");
    }
    @Override
    public void fly() {
        System.out.println(getName() + " can fly. ");

    }

    @Override
    public String toString() {
        return   getClass().getSimpleName() +
                "breed='" + getBreed()+ '\'' +
                ", name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", size='" + getSize()+ '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ",  can swim  =" + canFly +
                ",  can play  =" + abletoPlay    +
                '}';
    }


}



