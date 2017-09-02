package ChapterTen;

class EmployeeWithTerritory extends Employee
{
    private int empTerritory;

    int getEmpTerritory()
    {
        return empTerritory;
    }

    void setEmpTerritory(@SuppressWarnings("SameParameterValue") int empTerritory)
    {
        this.empTerritory = empTerritory;
    }
}
