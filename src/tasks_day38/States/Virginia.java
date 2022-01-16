package tasks_day38.States;

public class Virginia extends  States{
    public Virginia(String name, String abbreviation, String politicalParty, String governor, String senator, long population, double stateTax) {
        super(name, abbreviation, politicalParty, governor, senator, population, stateTax);
    }


    public void weather(){
        System.out.println(getName()+"  has  freezing  winters !");
    }


}
