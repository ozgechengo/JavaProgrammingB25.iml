package tasks_day38.ScrumTeam;

public class Developer extends Employee {


    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void coding() {
        System.out.println(getJobTitle() + " " + getName() + " is coding .");


    }

    public void fixBugs() {
        System.out.println(getJobTitle() + " " + getName() + "is fixing the bugs ");

    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                   "ID=" + getId() +
                 ", salary=" + getSalary() +
                 ", job title ='" + getJobTitle() + '\'' +
                   '}';

    }
}