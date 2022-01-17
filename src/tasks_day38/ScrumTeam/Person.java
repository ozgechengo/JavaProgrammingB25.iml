package tasks_day38.ScrumTeam;

public class Person {
    private String name;
    private int  age;
    private char gender;

    public Person(String name, int age, char gender) {
        setAge(age);
        setName(name);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            System.err.println("Invalid name:" + name);
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.out.println(" INVALID AGE");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void dring(String dring){
        System.out.println(name+ "  is drinkgin ");
    }

    public void eat(String food){
        System.out.println(name+ "  is eating");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

