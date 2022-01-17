package tasks_day38.ScrumTeam;

public class Scrum_Master extends Employee {


    public Scrum_Master(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void coaching(){

        System.out.println(getJobTitle()+" "+getName()+ "is coaching the team.");

    }



    @Override
    public String toString() {
        return "Scrum Master { " +
                "name=' " + getName() + '\'' +
                ", age=  " + getAge() +
                ", gender=  " + getGender() +
                " ID =" + getId() +
                ", salary=" + getSalary() +
                ", job title  ='" + getJobTitle() + '\'' +


                '}';
    }
}


