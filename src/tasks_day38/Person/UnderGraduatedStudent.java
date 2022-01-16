package tasks_day38.Person;

public class UnderGraduatedStudent extends Student{


    public UnderGraduatedStudent(String name, int age, char gender, int studentId, String fieldsOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldsOfStudy, grade, schoolName);
    }

    public void study(){
        System.out.println(getName() + " is still studying :)  " );
    }
}



/*
2. UndergraduateStudent

						Override the study method

						add any additional fields and methods if necessary

 */