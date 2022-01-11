package tasks_day37.Scrum_Task;

public class Employee_two extends Personone {

      public int ID;
      public  String jobTitle;
      public double salary;
      public String companyName;

    public Employee_two(String name, int age, char gender, int ID, String jobTitle, double salary, String companyName) {
        super(name, age, gender);
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.companyName = companyName;
    }

    public void work(){
         System.out.println(jobTitle+"  "+ name+ "is working.  ");

}

    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}



