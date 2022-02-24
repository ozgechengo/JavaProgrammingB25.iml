package day43_ABSTRACTION.Animal;

public abstract class Animal {

    private String name, color;
    private int age;


    public Animal(String name, String color, int age) {
        setName(name);
        setColor(color);
        setAge(age);

    }

    public String getName() {
        return name;
    }


    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }


    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            throw new RuntimeException("Name cannot be empty or blank");
        }
        this.name = name;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new RuntimeException("Invalid age");
        }
        this.age = age;
    }


    public abstract void eat();



    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +

                ", color='" + color + '\'' +
                ", age=" + age +


                '}';



}}
