package tasks_day38.Animal;


public class Lion extends  WildAnimal{
    public Lion(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " " + getBreed() + " is hunting animals");
    }

    @Override
    public void move() {
        System.out.println(getName() + " " + getBreed() + " is moving so fast");
    }


    /*
Create the following sub classes of WildAnimal and Override the hunt method, and add any extra methods that are needed:
				1. Lion
				2. Tiger
				3. Eagle
				4. Bear
				5. Python
				6. Crocodile


 */
}