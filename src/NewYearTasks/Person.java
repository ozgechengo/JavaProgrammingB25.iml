package NewYearTasks;
public class Person {

    public String name;
    public int    age;
    public char   gender;
    public static  boolean isHuman=true;
    public static  boolean hasNose=true;
    public static  boolean hasWings=true;
    public static  int     numberOfHead=1;
    public static   int    numberOfeyes=2;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void eat(String food) {
        System.out.println(name+"  is drinking  "+food);
    }
    public void drinking(String drink){
        System.out.println(name+"  is drinking  "  +drink);
    }
    public void sleeping(){
        System.out.println(name+" is sleeping.");

    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", gender=" + gender +
                ", gender=" + gender +
                '}';
    }

    public static void main(String[] args) {
        Person per1=new Person("ozge",42,'F');
        Person per2=new Person("burak",26,'M');


        System.out.println(per1);
        System.out.println(per2);
        per2.sleeping();

        System.out.println(Person.hasNose);
        System.out.println(Person.hasWings);
        System.out.println(Person.isHuman);
        System.out.println(Person.numberOfeyes);
        System.out.println(Person.numberOfHead);
        per1.drinking("ayran");
        per2.eat("lahmacun");


    }
}