package day30_CustomClass;

public class Cat {

   public String name;
   public String breed;
   public int    age;
   public String color;
   public int price;
   public String  hair;

    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                ", hair='" + hair + '\'' +
                '}';
    }


        public void miav () {
            System.out.println(name + "  is miaving");
        }
        public void scrach () {
            System.out.println(name + " is scraching ");
        }
        public void run () {
            System.out.println(name + "  is running");
        }
    public void setInfo(String name, String breed, int age, String color, int price, String hair) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.price = price;
        this.hair = hair;


    }
    }