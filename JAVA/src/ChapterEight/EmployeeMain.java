package ChapterEight;

public class EmployeeMain
{
    public static void main(String[] args)
    {
        Employee[] emp = new Employee[7];
        final int START_NUM = 101;
        final double PAYRATE = 6.35;

        for (int x = 0; x < emp.length; ++x)
            emp[x] = new Employee(START_NUM + x, PAYRATE);

        for (Employee val : emp)
            val.printer();
    }
}