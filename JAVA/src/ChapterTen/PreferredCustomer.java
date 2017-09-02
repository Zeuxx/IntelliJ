package ChapterTen;

public class PreferredCustomer extends Customer
{
    private double discountRate;

    PreferredCustomer(int idNumber, double balanceOwed, double discountRate)
    {
        super(idNumber, balanceOwed);
        this.discountRate = discountRate;
    }

    public void display()
    {
        super.display();
        System.out.println(" Discount rate is " + discountRate);
    }
}
