package day45_Interface.Animal_Task;

public final class Eagle extends Animal implements Flyable,Wild {
    public Eagle(String breed, String name, String color, String size, char gender, int age) {
        super(breed, name, color, size, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "eats dead animal ");

    }

    @Override
    public void fly() {
        System.out.println(getName() + " can fly");

    }

    @Override
    public void hunt() {
        System.out.println(getName() + "can hunt ! ");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "breed='" + getBreed() + '\'' +
                ", name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", size='" + getSize() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ",  is wild ?   =" + isWild +
                ",  can swim  =" + canFly +
                '}';
    }

}