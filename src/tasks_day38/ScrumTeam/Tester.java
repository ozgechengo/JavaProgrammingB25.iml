package tasks_day38.ScrumTeam;

public class Tester  extends Employee{


    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void createTicket(){
        System.out.println(getName()+ " is creating ticket");
    }

    @Override
    public String toString() {
        return "Tester {" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                 "ID=" + getId() +
                ", salary=" + getSalary() +
                ", job title ='" + getJobTitle() + '\'' +
                '}';

}}
