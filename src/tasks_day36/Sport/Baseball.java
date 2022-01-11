package tasks_day36.Sport;

public class Baseball extends Sport{


    public int hits, atBats;

    public void setInfo(String name, int numberOfPlayers, int numberOfReferee, String rules,
                        int hits, int atBats) {
        this.setInfo(name, numberOfPlayers, numberOfReferee, rules);
        this.hits = hits;
        this.atBats = atBats;
    }

    public void battingAverage(){
        System.out.println("Batting average is " + (hits/atBats));
    }

    public String toString() {
        return "Baseball{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferee=" + numberOfReferee +
                ", rules='" + rules + '\'' +
                ", hits=" + hits +
                ", atBats=" + atBats +
                '}';
    }

}
