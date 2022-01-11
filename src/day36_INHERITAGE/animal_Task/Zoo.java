package day36_INHERITAGE.animal_Task;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', 2, 'L', "White");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();


        Cat cat = new Cat();
        cat.setInfo("Tarcin","British",'M',3,'S',"brown");

        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        cat.scratch();
        System.out.println(cat);





        Tiger tiger = new Tiger();
         tiger.setInfo("Sher Khan", "Bengal", 'M', 4, 'L', "Red");
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();

        tiger.roar();
        tiger.hunt();

        System.out.println(tiger);

        //  tiger.bark();



    }

}