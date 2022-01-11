package day36_INHERITAGE.animal_Task;

public class Animal {
    public String name;
    public String breed;
    public char   gender;
    public int age;
    public char size;
    public String color;



    public void setInfo(String name, String breed, char gender, int age, char size, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;

    }



    public void eat(){
        System.out.println(name+"is eating.");
    }
    public void drink(){
        System.out.println(name+"is drink");
    }
    public void move(){
        System.out.println(name+"is moving.");
    }
    public void sleep(){
        System.out.println(name+"is sleaping.");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}

