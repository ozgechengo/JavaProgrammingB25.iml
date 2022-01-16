package tasks_day38.Animal;

public class Dolphin extends FriendlyAnimal{
    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void swim(){
        System.out.println(getName()+ " " +getBreed()+ " is swimming");
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " " +getBreed() +" is eating special food");
    }


}
/*
Dolphin:
					Extra methods:
						swim()
 */