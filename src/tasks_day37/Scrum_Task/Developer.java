package tasks_day37.Scrum_Task;

public class Developer extends Employee_two {

    public Developer(String name, int age, char gender, int ID, String jobTitle, double salary, String companyName) {
        super(name, age, gender, ID, "DEVELOPER", salary, companyName);
    }


    public void  coding(){
        System.out.println(jobTitle+" "+name+" is coding .");


    }

    public void  fixBugs(){
        System.out.println(jobTitle+" "+name+"is fixing the bugs ");

    }


    public String toString() {
        return "Developer{" +
                "ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
