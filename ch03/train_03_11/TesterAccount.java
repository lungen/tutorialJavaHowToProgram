// TesterAccount.java

// create account
public class TesterAccount
{
    // instance variables
    private String name;
    private double balance;

    // constructor
    public TesterAccount(String name, double balance)
    {
        this.name = name;
        if (balance >= 0) this.balance = balance;
    }

    /// geters and seters
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    // method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount)
    {
        if (depositAmount > 0)
            this.balance = this.balance + depositAmount;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public void withdraw(double amount)
    {
        if (this.balance < amount)
            System.out.println("Amount too hight! Withdraw not possible!");
        else
            this.balance = this.balance - amount;
    }
}
