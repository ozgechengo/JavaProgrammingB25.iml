package task1;

public class SalaryCalculator {

    public  double hourlyRate, stateTaxRate, federalTaxRate;
    public  int     weeklyHours;


    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "Your Salary =" + salary() +
                ", State Tax  = $ " + stateTax() +
                ", Federal Tax  =  $ " + federalTax() +
                ", Your Salary  After tax = $ " + salaryAfterTax() +
                '}';
    }
    public double salary(){
        return (hourlyRate*weeklyHours)*52;
    }

    public double stateTax(){
        return (salary()*stateTaxRate)/100;
    }
    public double federalTax(){
        return (salary()*federalTaxRate)/100;
    }
    public double salaryAfterTax(){
        return salary()-federalTax()-stateTax();
    }}


/*
1.1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): claculates the totalstateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */
