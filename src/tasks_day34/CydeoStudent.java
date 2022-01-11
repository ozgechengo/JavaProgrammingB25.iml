package tasks_day34;

public class CydeoStudent {
    public  String name ;
    public  int  age ;
    public  int  batchNumber;
    public  int  groupNumber;
    public  char gender;
    public  String FieldOfStudy;

    public  static  String  programmingLanguage;
    public  static  String  schoolName;
    public  static  String  screetCode;

    public CydeoStudent(String name, int age, int batchNumber, int groupNumber, char gender, String fieldOfStudy) {
        this.name = name;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.gender = gender;
        FieldOfStudy = fieldOfStudy;

}

    static {

         programmingLanguage="JAVA" ;
         schoolName="CYDEO";
         screetCode="WOODEN SPOON";


    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", gender=" + gender +
                '}';
    }
    public static void printSchoolName( ){
        System.out.println(schoolName);
    }
    public static void ProgrammingLanguage( ) {
        System.out.println(programmingLanguage);
    }
    public static void printsetScreetCode( ) {
        System.out.println(screetCode);
    }
    public void   attandeClass( ) {
        System.out.println(name + "  attands class");
    }
    public void   study( ) {
        System.out.println(name + "  is studying.");
    }
    public static void main(String[] args) {

        CydeoStudent student=new CydeoStudent("ROCKY",34,232,232,'M',"SDET");
        System.out.println(student);
        student.attandeClass();
        student.study();
        printSchoolName();
        printsetScreetCode();

    }
}