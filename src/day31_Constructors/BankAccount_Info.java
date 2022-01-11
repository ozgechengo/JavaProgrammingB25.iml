package day31_Constructors;

public class BankAccount_Info {
    public static void main(String[] args) {

        BankAccount account1=new BankAccount();
        account1.setInfo("Ozge Sengocen",23234312,679.54);
        BankAccount account2=new BankAccount();
        account2.setInfo("Cihan Sengocen",4342323,989.43);
        BankAccount account3=new BankAccount();
        account3.setInfo("Burak Sengocen",54543323,1059.43);
        BankAccount account4=new BankAccount();
        account4.setInfo("Berk Sengocen",32323112,9080.23);
        BankAccount account5=new BankAccount();
        account5.setInfo("Hikmet Bektay",3232332,450.65);

        account3.checkBalance();
        account3.deposit(10000);
        System.out.println(account3);

         account1.checkBalance();
         account1.deposit(20000);
        account1.withdraw(2300);
        System.out.println(account1);


    }
}
