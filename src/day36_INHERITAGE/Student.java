package day36_INHERITAGE;

public class Student {

    private  String name;
    private   int   age;
    private  char  gender;
    private   char grade ;
    private   String schoolname;

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
          if( age<5 || age>90){
       System.err.println("INVALID ENTRY  FOR AGE! ");
        System.exit(0);
          }
              this.age = age;
          }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if(!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')){
            System.err.println("Invalid grade  for : " +name );
            System.exit(0);
        }
        this.grade = grade;
    }
      public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if( !(gender != 'M' || gender != 'F')){
            System.err.println("Invalid  character  !" );
            System.exit(0);
        }


              this.gender = gender;}

    public Student(String name,String schoolname, int age, char gender, char grade) {
        setAge(age);
        setGender(gender);
        setName(name);
        setGrade(grade);
        setSchoolname(schoolname);

    }

    public String toString() {
        return "Student{" +
                "schoolname='" + schoolname + '\'' +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }

    public void study(){
        System.out.println(name+"is studying");
    }

    public static void main(String[] args) {
         Student student1=new Student("Ayse","CYDEO",15,'F','A');

         System.out.println(student1);
         Student student2=new Student("FATMA","CYDEO",4,'X','X');






    }
}


/*
             1. age should not be set less than 5 nor greater than 90
                        2. gender should not be set to any chanarcter other than: 'M' and 'F'
                        3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'

            Add a constructor that can set all teh fields when the object is created
                        (requirments of fileds in the above must be applied)


            Methods:
                study()
                toString()

 */
