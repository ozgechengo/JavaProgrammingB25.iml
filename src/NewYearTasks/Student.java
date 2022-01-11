package NewYearTasks;

public class Student {
    private String name;
    private int age;
    private char gender;
    private char grade;
    private String schoolName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(age < 5 || age > 90){
            System.err.println("Invalid age: " + age);
            return;
        }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender == 'M' || gender == 'F')){
            System.err.println("Invalid gender: " + gender);
            return;
        }
        this.gender = gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if(!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')){
            System.out.println("Invalid grade: " + grade);
            return;
        }
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student(String name, int age, char gender, char grade, String schoolName) {
        this.name = name;
        setAge(age);
        setGender(gender);
        setGrade(grade);
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(name + " is studying");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }


    public static void main(String[] args) {

     Student student1 = new  Student("Mary", 25, 'F', 'A', "Cydeo School");
     Student student2 = new  Student("Mary", 3, 'x', 'x', "Cydeo School");

        System.out.println(student1);
        System.out.println(student2);

        student1.getGrade();
        student2.getGrade();
    }
}

