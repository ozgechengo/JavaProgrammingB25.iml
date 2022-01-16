package tasks_day38.States;

public class Texas extends States{
    public Texas(String name, String abbreviation, String politicalParty, String governor, String senator, long population, double stateTax) {
        super(name, abbreviation, politicalParty, governor, senator, population, stateTax);
    }

    public void weather(){
        System.out.println(getName()+"  is so hot in the summer !! ");
    }


}
