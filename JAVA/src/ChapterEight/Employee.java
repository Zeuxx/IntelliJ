package ChapterEight;

public class Employee
{
    private int empNum;
    private double empSal;
    Employee(int e, double s)
    {
        empNum = e;
        empSal = s;
    }

    public int getEmpNum()
    {
        return empNum;
    }

    public double getEmpSal()
    {
        return empSal;
    }

    void printer()
    {
        System.out.println(this.empNum);
        System.out.println(this.empSal);
    }
}
