package day08_IfStatements;

public class SalaryCalculator {

    public static void main(String[] args) {

        int  hourlyRate  = 50;
        int weeklyHours    = 45;

        double   stateTaxRate  = 6.5,
                federalTaxRate = 26.2;

        //--------------------------------------

        double  salaryBeforeTax        = hourlyRate * weeklyHours * 52;
        double  stateTax               = salaryBeforeTax * stateTaxRate /100 ;
        double  federalTax             = salaryBeforeTax * federalTaxRate / 100 ;
        double  totalTax               =  stateTax + federalTax;
        double  salaryAfterTax         =  salaryBeforeTax - totalTax ;
        
        

        System.out.println("State Tax  = " + stateTax);
        System.out.println("Federal Tax  is = $ " + federalTax);
        System.out.println("Gross Pay   is = $ " + salaryBeforeTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("Net income is = " + salaryAfterTax);





    }}