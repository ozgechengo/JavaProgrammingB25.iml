package day10_NestedIf;

public class FieldTripWithNestedIf {
    public static void main(String[] args) {

        int grade = 2;
        String location = "";
        int groupNumber = 0;
        String teacher = "";


        if (grade >= 1 && grade <= 6) {

            if (grade == 1) {
                location = "Apple orchard";
                groupNumber = 3;
                teacher = "Ms. Smith";
            } else if (grade == 2) {
                location = "Zoo";
                groupNumber = 7;
                teacher = "Mr. Lee";
            } else if (grade == 3) {
                location = "Aquarium";
                groupNumber = 5;
                teacher = "Ms. Wilson";
            } else if (grade == 4) {
                location = "Movie Theatre";
                groupNumber = 2;
                teacher = "Ms. Reyes";
            } else if (grade == 5) {
                location = "Museum";
                groupNumber = 5;
                teacher = "Ms.Leelee";
            } else if (grade == 6) {
                location = "Six Flags";
                groupNumber = 8;
                teacher = "Ms.wats";
            } else {
                System.out.println("Invalid Grade");}
                System.out.println("location = " + location+ "\ngroupNumber = " + groupNumber+ "\nteacher = " + teacher);
            }}}







/*
        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes
        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela
        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt
 */
