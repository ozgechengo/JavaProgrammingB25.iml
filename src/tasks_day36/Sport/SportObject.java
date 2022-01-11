package tasks_day36.Sport;

public class SportObject {
    public static void main(String[] args) {



        Basketball basketball = new Basketball();
        basketball.setInfo("NBA", 10, 2,"13");
        basketball.play();
        basketball.block();
        basketball.assist();

        System.out.println(basketball);

        Baseball baseball= new Baseball();
        baseball.setInfo("GO AHEAD", 9,7,"15");
        baseball.play();



        System.out.println(baseball);

        Football football = new Football();
        football.setInfo("FENERBAHCE", 11, 3,"17");
        football.play();
        football.offSide();

        System.out.println(football);


        AmericanFootball americanFootball= new AmericanFootball();
        americanFootball.setInfo("RED HOT CHILIES", 11,7,"18");
        americanFootball.play();
        americanFootball.trap();

        System.out.println(americanFootball);



    }
}


