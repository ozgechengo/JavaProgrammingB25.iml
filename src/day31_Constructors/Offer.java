package day31_Constructors;

public class Offer {

    public String location,companyName,jobtitle;

    public double salary;
    boolean hasPTO,hasBenefits,isWFM, isFulltime;


    public void setInfo(String location, String companyName, String jobtitle, double salary, boolean hasPTO, boolean hasBenefits, boolean isWFM, boolean isFulltime) {
        this.location = location;
        this.companyName = companyName;
        this.jobtitle = jobtitle;
        this.salary = salary;
        this.hasPTO = hasPTO;
        this.hasBenefits = hasBenefits;
        this.isWFM = isWFM;
        this.isFulltime = isFulltime;
    }


    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobtitle='" + jobtitle + '\'' +
                ", salary=" + salary +
                ", hasPTO=" + hasPTO +
                ", hasBenefit=" + hasBenefits +
                ", isWFM=" + isWFM +
                ", isFulltime=" + isFulltime +
                '}';
    }



}
