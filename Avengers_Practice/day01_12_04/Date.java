package day01_12_04;

      class Date {
    public int year;
    public int month;
    public int day;

    public Date(){
        System.out.println("Happy Birthday !");

    }
    public Date(int year, int month , int day){
        this();
        this.day=day;
        this.month=month;
        this.year=year;


    }

    public String toString() {
        return "Date{" +
                "My birth year=" + year +
                ",My birth month=" + month +
                ",My birth day=" + day +
                '}';
    }
    public static void main(String[] args) {

        Date day1=new Date(1979,07,02);
        Date day2=new Date();

        System.out.println(day1);
    }

}




 /*   Write a class definition for Date, an object type that contains three
        integers,
        year, month and day. This class should provide two constructors. The first
        should take no parameters. The second should take parameters named year, month
        and day, and use them to initialize the instance variables.
        Write a main method that creates a new Date object named birthday. The new
        object should contain your birthdate. You can use either constructor.*/