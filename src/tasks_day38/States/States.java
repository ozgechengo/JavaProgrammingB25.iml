package tasks_day38.States;

public class States {

    private String  name;
    private String  abbreviation;
    private String  politicalParty;
    private String  governor;
    private String  senator;
    private long  population;
    private double  stateTax;

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, long population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null || name.isEmpty()||name.isBlank()){
            System.err.println("INVALID  NAME !! ");
            System.exit(1); }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if(abbreviation==null || abbreviation.isEmpty()||abbreviation.isBlank()){
            System.err.println(" WRONG  ABBREVIATION!! ");
            System.exit(1); }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if(politicalParty==null || politicalParty.isEmpty()||politicalParty.isBlank()){
            System.err.println(" ERROR  Wrong Political Party ! ");
            System.exit(1); }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if( governor==null || governor.isEmpty()||governor.isBlank()){
            System.err.println(" Wrong GOVERNOR  ! ");
            System.exit(1); }
        this.governor = governor;
    }
    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if( senator==null || senator.isEmpty()|| senator.isBlank()){
            System.err.println(" WRONG SENATOR! ");
            System.exit(1); }
        this.senator = senator;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        if( population<=0){
            System.err.println(" Wrong POPULATION !! ");
            System.exit(1); }
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if( stateTax<0){
            System.err.println(" Wrong tax rate ! ");
            System.exit(1); }
        this.stateTax = stateTax;
    }

    public String toString() {
        return "States{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
