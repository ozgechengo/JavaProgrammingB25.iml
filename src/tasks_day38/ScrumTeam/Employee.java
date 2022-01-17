package tasks_day38.ScrumTeam;

public class Employee  extends Person {

    private  int id;
    private  String jobTitle;
    private  double salary;


    public Employee(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    public void work(){
        System.out.println(getName()+  "  is working");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName()+ '\'' +
                ", age=" + getAge() +
                ",  id =" + id +
                ",  jobtitle =" + jobTitle +
                ", salary  =" + salary +
                ", gender=" + getGender() +
                '}';
    }
}
