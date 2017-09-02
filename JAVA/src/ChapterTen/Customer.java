package ChapterTen;

public class Customer
{
    private int idNumber;
    private double balanceOwed;

    Customer(int idNumber, double balanceOwed)
    {
        this.idNumber = idNumber;
        this.balanceOwed = balanceOwed;
    }

    public void display()
    {
        System.out.println("Customer #" + this.idNumber + " Balance $" + this.balanceOwed);
    }
}
