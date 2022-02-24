package day47_CASTING;


import day45_Interface.Animal_Task.Animal;
import day45_Interface.Animal_Task.Dog;
import day45_Interface.Shape.Circle;
import day45_Interface.Shape.Shape;

public class ReferanceTypeCasting {
    public static void main(String[] args) {





            //   Shape shape = (Shape) new Circle(4); //upcasting

            Shape shape2 = new Circle(5);

            // WebDriver driver = (WebDriver) new ChromeDriver();

            // Dog  dog2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");;
            //  Dog dog3 = dog2;


            Animal animal = new Dog("Max", "Husky", "PINK","medium", 'F', 2);

            // Dog dog = (Dog)animal; // downcasting
            //  dog.bark();

            System.out.println( animal.getName() );
            // System.out.println( dog.getName() );

            (  (Dog)animal  ).play();




        }


    }

