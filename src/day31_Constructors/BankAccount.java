package day31_Constructors;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public void checkBalance() {
        System.out.println("Your available balance is :  " + balance);
    }

    public void deposit(double amaount) {
        if (amaount <= 0) {
            System.err.println("AMOUNT CAN NOT BE O OR NEGATIVE");
        }
        balance += amaount;
        System.out.println("Your balance is " + balance);
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.err.println("INVALID AMOUNT");
            return;
        }
        if (amount == 0) {
            System.out.println("YOUR AMOUNT CAN NOT BE  '0'");
        }
        balance -= amount;
        System.out.println("Your balance is : " + balance);
    }


}



