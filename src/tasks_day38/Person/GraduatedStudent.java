package tasks_day38.Person;

public class GraduatedStudent  extends  Student{

    public GraduatedStudent(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        System.out.println(getName()+ " has graduated from "+ getSchoolName() + " with a dgree of "+ getGrade());
        System.out.println("CONGURULATIONS !!!");
    }

    public void master(){
        System.out.println(" about the finish his MBA Degree");
    }



}





/*
1. GraduateStudent:

						Override the study method
 add any additional fields and methods if necessary
 */
