package tasks_day38.States;

public class California  extends  States{
    public California(String name, String abbreviation, String politicalParty, String governor, String senator,long population, double stateTax) {
        super(name, abbreviation, politicalParty, governor, senator, population, stateTax);
    }

    public void surf(){
        System.out.println(getName()+" is a grate option for surfing !");
    }
}


