package tasks_day38.Animal;

public class Dog extends FriendlyAnimal {

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void bark(){
        System.out.println(getName()+" "+ getBreed()+" is barking loudly");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating dog food");
    }
}
/*
Create the following sub classes of FriendlyAnimal and Override the eat method
			1. Dog:
					Extra methods:
						bark()


 */