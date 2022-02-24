package day45_Interface.Animal_Task;

public final class Lion extends Animal implements  Wild {



    public Lion(String breed, String name, String color, String size, char gender, int age) {
        super(breed, name, color, size, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "eats everything ");

    }




    @Override
    public void hunt() {
        System.out.println(getName() + " knows how to hunt ");

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

                '}';
    }

}



