package tasks_day38.Person;

public class Person {

     private String name;
     private int age;
     private char gender;

    public Person(String name, int age, char gender) {
    setAge(age);
    setGender(gender);
    setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            System.err.println("Invalid name:" + name);
            System.exit(1);
        }
        char [] chars=name.toCharArray();
             for (char each : chars) {
             if (Character.isDigit(each)) {
                System.out.println(" ERROR !! ");
                System.exit(1);}
             if(!Character.isLetterOrDigit(each)){
                if(!(each ==' ')) {
                    System.err.println("Invalid entry");
                    System.exit(1);
                }
            }


              }

                this.name = name;

        }
    public int getAge() {
        return age;}
        public void setAge(int age) {
            if(age<0){
                System.err.println("Invalid age");
                System.exit(1);
            }
            this.age = age;
        }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender== 'M'|| gender== 'F')){
            System.err.println("ERROR !");
            System.exit(1);
        }
        this.gender = gender;
    }

    public void eat(){
        System.out.println(name +" is eating.");
    }

    public void drink(){
        System.out.println(name +" is drinking.");
    }

    public void sleep(){
        System.out.println(name + " is sleeping.");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}


/*
2. Create a subclass of Person named Student:
				Extra variables:
						studentId, fieldOfStudy, grade, schoolName

				Encapsulate all the fields

				Add a constructor that can set all the fields

							Condition:
									1. filedOfStudy and schoolName should not be set to null
									2. filedOfStudy and schoolName should not be empty
									3. grade must be valid (A, B, C, D, F)


 */