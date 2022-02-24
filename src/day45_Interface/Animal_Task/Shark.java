package day45_Interface.Animal_Task;

public final class Shark extends  Animal implements Wild,Swimmable {
    public Shark(String breed, String name, String color, String size, char gender, int age) {
        super(breed, name, color, size, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats everything ");

    }

    @Override
    public void swim() {
        System.out.println(getName()+ " swims so fast! ");

    }

    @Override
    public void hunt() {
        System.out.println(getName() + "  can hunt !");

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
                ",  can swim " + canswim +
                ",  is wild ?   =" + isWild +

                '}';
    }

}
