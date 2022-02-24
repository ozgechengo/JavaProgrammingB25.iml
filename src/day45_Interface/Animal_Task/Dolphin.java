package day45_Interface.Animal_Task;

public final class Dolphin  extends Animal implements Swimmable,Playable{

    public Dolphin(String breed, String name, String color, String size, char gender, int age) {
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
    public void swim() {
        System.out.println( getName() + " knows how to swim  ");
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
                ",  can swim  =" + canswim +
                ",  can play  =" + abletoPlay    +
                '}';
    }
}
