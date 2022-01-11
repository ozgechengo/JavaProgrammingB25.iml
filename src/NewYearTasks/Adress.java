package NewYearTasks;

public class Adress {
    public int no;
    public String street, city, state;
    public int zipCode;
    public static String country = " USA";
    public static String planet = " EARTH";


    public void setInfo(int no,String street, String city, String state, int zipCode) {
        this.street = street;
        this.no=no;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return "Adress{" +no+"  " +street +" \n " + city +" \n  "+ state + "  , \n  "+ zipCode +
                '}';
    }


    public static void main(String[] args) {
        Adress adress1=new Adress();
       adress1.setInfo(145,"Beverly Park","Beverly Hills","CA",90210);
        System.out.println(adress1);


    }
}
/*


		    Actions
		            setInfo: sets all the instances
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012

 */