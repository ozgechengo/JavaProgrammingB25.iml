package day30_CustomClass;

public class Dog2 {



    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;
    public double weight;

         public void setInfo(String name, String breed, int age, char gender, String size, String color ,double weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.size = size;
        this.color = color;
    }

    public String toString() {
        return "Dog2{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void bark(){
        System.out.println(name+" is barking");
    }




    }
