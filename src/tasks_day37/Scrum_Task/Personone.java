package tasks_day37.Scrum_Task;

public class Personone {
    public String name;
    public int age;
    public char gender;





    public Personone(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

   public void eat(String food){
       System.out.println(name+ "is eating ."+ food);
    }
    public void dring(String drink) {
        System.out.println(name + " is drinking ." + drink);

    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}