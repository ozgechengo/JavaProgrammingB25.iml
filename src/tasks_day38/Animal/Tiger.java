package tasks_day38.Animal;

public class Tiger extends  WildAnimal{

    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }


    @Override
    public void eat() {
        System.out.println(getName()+ " "+ getBreed() +" is kill with a bite to the neck and eating his food");
    }

    @Override
    public void move() {
        System.out.println(getName()+ " "+ getBreed()+ " is moves so fast from one to another distance");
    }

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