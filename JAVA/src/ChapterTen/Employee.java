package ChapterTen;

import java.util.GregorianCalendar;

public class Employee
{
    private int empNum;
    private double empSal;
    private String firstName;
    private String lastName;
    private int socialSecurityNumber;
    private GregorianCalendar dateOfHire;
    private double rateOfPay;

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber)
    {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public GregorianCalendar getDateOfHire()
    {
        return dateOfHire;
    }

    public void setDateOfHire(GregorianCalendar dateOfHire)
    {
        this.dateOfHire = dateOfHire;
    }

    double getRateOfPay()
    {
        return rateOfPay;
    }

    public void setRateOfPay(double rateOfPay) { this.rateOfPay = rateOfPay; }

    int getEmpNum()
    {
        return empNum;
    }

    void setEmpNum(@SuppressWarnings("SameParameterValue") int empNum)
    {
        this.empNum = empNum;
    }

    double getEmpSal()
    {
        return empSal;
    }

    void setEmpSal(double empSal)
    {
        this.empSal = empSal;
    }

    public void displayRateOfPay()
    {
        System.out.println("Pay is " + rateOfPay + " per week ");
    }
}
