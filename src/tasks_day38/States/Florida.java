package tasks_day38.States;

public class Florida extends States{
    public Florida(String name, String abbreviation, String politicalParty, String governor, String senator, long population, double stateTax) {
        super(name, abbreviation, politicalParty, governor, senator, population, stateTax);
    }


    public void weather(){
        System.out.println(getName()+" has amazing  climate !!");
    }
    public void swim(){
        System.out.println(getName()+" has beautifull beaches that you can swimm ! ");
    }
}
