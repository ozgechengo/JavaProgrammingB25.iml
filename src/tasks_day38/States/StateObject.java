package tasks_day38.States;

public class StateObject {

    public static void main(String[] args) {


        Virginia virginia = new Virginia("Virginia", "VA", "Democrats", "Larry Hogan", "Billi Page", 1235000, 19);
        System.out.println(virginia);

        California california = new California("California", "CA", "Democrats", "Larry Hogan", "Billi Page", 3550000, 25);
        System.out.println(california);

        Texas texas = new Texas("Texas", "TX", "Republicans", "Larry Hogan", "Billi Page", 1800000, 15);
        System.out.println(texas);

        Florida florida = new Florida("Florida", "FL", "Republicans", "Ron DeSantis", "Billi Page", 2235000, 17);
        System.out.println(florida);



        florida.swim();
        texas.weather();
        virginia.weather();


    }


}

