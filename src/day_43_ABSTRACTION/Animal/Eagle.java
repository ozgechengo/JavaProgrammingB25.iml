package day_43_ABSTRACTION.Animal;

public class Eagle extends  Animal{


    public Eagle(String name, String color, int age) {
        super("Eagle", color, age);






    }

    @Override
    public void eat() {
        System.out.println( getName()+" is eating  carrion   ");
    }
}
