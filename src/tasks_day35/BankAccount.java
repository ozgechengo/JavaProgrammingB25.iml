package tasks_day35;

public class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {

        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);

    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;

    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
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
    public void deposit(double amaount) {
        if (amaount <= 0) {
            System.err.println("AMOUNT CAN NOT BE O OR NEGATIVE");
        }
        balance += amaount;
        System.out.println("Your balance is " + balance);
    }
    public void checkBalance() {
        System.out.println("Your available balance is :  " + balance);
    }

    public static void main(String[] args) {

       BankAccount account=new BankAccount("ozge",23232,23.343);

         account.setAccountNumber(3232);



    }
}

