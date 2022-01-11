package NewYearTasks;

  public class Dog {
            public String  breed, size,color;
            public  char   gender;
            public  int    age;

            public   static  int numberOfLegs=4 ;
            public   static  int numberOfEyes=2;
            public   static  int numberOfWings=2;

            public   static  boolean   isFriendly;


      public Dog(String breed, String size, String color, char gender, int age) {
          this.breed = breed;
          this.size = size;
          this.color = color;
          this.gender = gender;
          this.age = age;
      }

      public String toString() {
          return "Dog{" +
                  "breed:'" + breed + '\'' +
                  ", size:'" + size + '\'' +
                  ", color:'" + color + '\'' +
                  ", gender:" + gender +
                  ", age=" + age +
                '}';
      }
      public void eat(){
          System.out.println(breed+" is eating ");
      }
      public void sleep(){
          System.out.println(breed+ " is sleeping");
      }
      public void play(){
          System.out.println(breed+ " is playing");
      }

      public static void main(String[] args) {

          Dog cutie=new Dog("Husky","Large","Yellow",'F',5);
          System.out.println(cutie);
          System.out.println("Number of yes : "+numberOfEyes);
          System.out.println("Number of legs :"+numberOfLegs);
          System.out.println("Number of wings : "+numberOfWings);
          cutie.eat();
          cutie.play();
          cutie.sleep();
      }
  }

