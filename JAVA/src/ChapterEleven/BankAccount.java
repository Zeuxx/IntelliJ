package ChapterEleven;

public class BankAccount
{
    private int acctNum;
    private double balance;

    BankAccount(int acctNum, double balance)
    {
        this.acctNum = acctNum;
        this.balance = balance;
    }

    public String toString()
    {
        return "BankAccount acctNum = " + acctNum +
                "   Balance = $" + balance;
    }
}
