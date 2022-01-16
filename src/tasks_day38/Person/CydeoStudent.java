package tasks_day38.Person;

public class CydeoStudent extends Student{
    private  int batchNumber;
    private  int groupNumber;
    private  String programmingLanguage;


    public CydeoStudent(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber<=0){
            System.out.println("INVALID NUMBER");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if(groupNumber<=0){
            System.out.println("INVALID NUMBER");
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage == null || programmingLanguage.isBlank() || programmingLanguage.isEmpty()) {
            System.err.println("Invalid name !");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats , " +programmingLanguage);

    }

    @Override
    public void drink() {
        System.out.println(getName()+" drinks , " +programmingLanguage);
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" dreams about " +programmingLanguage);
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" +getName() + '\'' +
                "batch number ='" +batchNumber + '\'' +
                "group number ='" + groupNumber+ '\'' +
                "programming Language = '" + programmingLanguage+ '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "studentId=" + getStudentId()+
                ", fieldOfStudy='" + getFieldOfStudy()+ '\'' +
                ", grade=" + getGrade() +
                ", schoolName='" + getSchoolName() + '\'' +
                '}';
    }
}


/*
CydeoStudent:

						Extra Variables:
							batchNumber, groupNumber, programmingLanguage

						Encapsulate all the fields

						Add a constructor that can set all the fields

								Condition:
									1. batchNumber and groupNumber should not be set to zero or negative
									2. programmingLanguage should not be set to null
									3. programmingLanguage should not empty


						Override the eat, drink and sleep methods (programmingLanguage need to be included)

						Override the toString method:
								name, age, gender, studentId, fieldOfStudy, grade, schoolName,
								batchNumber, groupNumber, programmingLanguage should be included
 */
