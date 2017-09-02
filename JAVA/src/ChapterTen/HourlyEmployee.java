package ChapterTen;

public class HourlyEmployee extends Employee
{
    public void displayRateOfPay()
    {
        System.out.println("Pay is " + super.getRateOfPay() + " per hour.");
    }
}
