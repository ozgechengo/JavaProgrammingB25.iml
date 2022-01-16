package tasks_day38.Animal;

public class Phyton extends WildAnimal{

     public Phyton(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(" is eating an animal");
    }

    public void swallow(){
        System.out.println(" is swallowing a human");
    }

    public void kill(){
        System.out.println(" is killing everything even a human");
    }


}