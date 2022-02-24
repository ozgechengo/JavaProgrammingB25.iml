package day45_Interface.Animal_Task;

public class Cat extends Animal implements Playable{




    public Cat(String breed, String name, String color, String size, char gender, int age) {
        super(breed,name, color, size, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eating cat food ");


    }

    @Override
    public void play() {
        System.out.println(getName()+ " loves to play ! " );

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
                ",  can play  =" + abletoPlay    +
                '}';
    }
    }


