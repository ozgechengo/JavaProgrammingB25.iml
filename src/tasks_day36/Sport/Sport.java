package tasks_day36.Sport;

public class Sport {

    public String  name;
    public  int    numberOfPlayers;
    public  int    numberOfReferee;
    public String  rules;

    public void setInfo(String name, int numberOfPlayers, int numberOfReferee, String rules) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfReferee = numberOfReferee;
        this.rules = rules;
    }

    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfRefere=" + numberOfReferee +
                ", rules='" + rules + '\'' +
                '}';
    }

   public void play(){
       System.out.println(name+ " has a game tonight ! ");

   }
}
