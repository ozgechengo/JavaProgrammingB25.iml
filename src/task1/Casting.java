package task1;

public class Casting {
    public String name;
    public int   age;
    public char gender;

    public Casting(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        return "casting{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
    public void act(){
        System.out.println(name+ " is an amazing movie star.");
    }
}
