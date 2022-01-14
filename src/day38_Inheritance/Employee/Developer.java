package day38_Inheritance.Employee;

public class Developer extends Employee{
    public Developer(String name, int age, char gender, int id, String jobTitle, double salary, String company) {
        super(name, age, gender, id, jobTitle, salary, company);
    }
    @Override
    public void work() {
        System.out.println(name+" is writing codes");
    }
    public void fixBugs(){
        System.out.println(jobTitle+" "+name+" is crying");
    }


}
