package tasks_day38.Animal;


public class ZOO {

    public static void main(String[] args) {
        Phyton  phyton=new Phyton("Lucky","Brezilian",'F',3,"LARGE","brownish");
        Cat cat=new Cat("Lucy","Siamese",'F',1,"Small","Black");
        Dog dog=new Dog("Alex","Husky",'M',3,"Large","white");
        Parrot parrot=new Parrot("Alan","X",'M',4,"Small","Pink");
        Bear bear=new Bear("Venus","idk",'F',5,"Large","Black");
        Crocodile crocodile=new Crocodile("Trump","idk",'M',5,"Medium","Green");
        Eagle eagle=new Eagle("Sky","bio",'M',1,"25 inch","black");
        Lion lion=new Lion("King","wild",'F',4,"Large","Brown");
        Tiger tiger=new Tiger("Queen","idk",'M',3,"Medium","DarkBlack");

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("parrot = " + parrot);
         System.out.println("parrot = " + parrot);

         System.out.println("bear = " + bear);
        System.out.println("tiger = " + tiger);

        System.out.println("lion = " + lion);
        System.out.println("crocodile = " + crocodile);
        System.out.println("eagle = " + eagle);



        dog.bark();
        dog.pet();
        dog.play();
        dog.eat();
        dog.drink();
        dog.move();
        dog.sleep();

        cat.eat();
        cat.meow();
        cat.scratch();
        cat.sleep();
        cat.pet();
        cat.drink();
        cat.move();

        lion.move();
        lion.drink();
        lion.eat();
        lion.hunt();
        lion.sleep();


        tiger.sleep();
        tiger.eat();
        tiger.move();
        tiger.drink();
        tiger.sleep();


        parrot.sing();
        parrot.play();
        parrot.drink();
        parrot.eat();
        parrot.fly();




        /*
        Create a class named Zoo:
			Create the objects of each sub classes and

			test all the functions of each objects

            Analyze the relationships between the classes

         */



    }
}