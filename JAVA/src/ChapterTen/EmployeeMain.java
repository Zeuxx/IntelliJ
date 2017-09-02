package ChapterTen;

public class EmployeeMain
{
    public static void main(String[] args)
    {
        // Employee receptionist = new Employee();
        // Employee deliveryPerson = new Employee();
        EmployeeWithTerritory northenRep = new EmployeeWithTerritory();

        northenRep.setEmpNum(915);
        northenRep.setEmpSal(210.00);
        northenRep.setEmpTerritory(5);

        System.out.println(northenRep.getEmpNum());
        System.out.println(northenRep.getEmpSal());
        System.out.println(northenRep.getEmpTerritory());

        // Can use instanceof operator to determine whether an object
        // is a member or descendant of a class

        // Member
        //System.out.println(northenRep instanceof EmployeeWithTerritory);

        // Descendant
        //System.out.println(northenRep instanceof Employee);

        HourlyEmployee one = new HourlyEmployee();

        one.setEmpSal(8.75);
        one.displayRateOfPay();
    }
}