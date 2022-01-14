package day38_Inheritance.Animal;

public class Animal {

    public String name, breed, color;
    public int age;
    public char gender;
    public char size;

    public Animal(String name, String breed, String color, int age, char gender, char size) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.gender = gender;
        this.size = size;
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size=" + size +
                '}';
    }

    public void eat() {
        System.out.println("eating  food");

    }


}
