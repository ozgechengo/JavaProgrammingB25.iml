package day38_Inheritance.Employee;

public class Driver extends Employee{
    public Driver(String name, int age, char gender, int id, String jobTitle, double salary, String company) {
        super(name, age, gender, id, jobTitle, salary, company);
    }

    @Override
    public void work() {
        System.out.println("Is cleaning his car ");


    }

public void drives(){

    System.out.println(name+ "is driving");
}

}
