package NewYearTasks;

public class CyeoStudents {
    public String name;
    public int age;
    public char gender;
    public int ID;
    public char grade;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName = "Cydeo";
    public static String programmingLanguage = "Java";

    public CyeoStudents(String name, int age, char gender, int ID, char grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID = ID;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study() {
        System.out.println(name + " is studying.");

    }

    public void attendClass() {
        System.out.println(name + " always attends classes.");

    }

    public static void printSchoolName(){
        System.out.println(schoolName);
    }
    public static void printProgrammingLanguage(){
        System.out.println(programmingLanguage);

    }

    public String toString() {
        return "CyeoStudents{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", ID=" + ID +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
    public static void main(String[] args) {
         CyeoStudents sut1=new CyeoStudents(" OZGE",42,'F',1212,'A',23,21213);
         sut1.attendClass();
         sut1.study();

        CyeoStudents.printProgrammingLanguage();
        CyeoStudents.printSchoolName();


    }}
