package day38_Inheritance.Employee;

public class Pilot extends Employee{
    public Pilot(String name, int age, char gender, int id, String jobTitle, double salary, String company) {
        super(name, age, gender, id, jobTitle, salary, company);
    }



    @Override
    public void work() {
        System.out.println("Is  sleeping");


    }

    public void aviate(){
        System.out.println(name+"is aviating");


    }



}
