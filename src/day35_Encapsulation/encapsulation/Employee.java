package day35_Encapsulation.encapsulation;

public class Employee {

    private String name;
    private int age;
    private char gender;
    private double salary;

    public Employee(String name, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            System.out.println("NOT VALID");
            System.err.println(0);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<16 || age>70){
            System.out.println("YOU ARE NOT ALLOVED TO WORK");

        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender=='F'|| gender=='M')){
            System.out.println("INVALID");

        }
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<=90.000){
            System.out.println("NOT ENOUGH");

        }
        this.salary = salary;
    }

    public static void main(String[] args) {

        Employee e1=new Employee("  ",'x',5 , 29.221);


        System.out.println(" Name :"+ e1.getName()+ "\n Age :  "+ e1.getAge()+"\n Gender :  "+ e1.getGender()+"\n Salary : "+e1.getSalary());
        System.out.println(e1.getSalary());
    }
}
