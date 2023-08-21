public class Manager extends Employee
{
    private String department;

    public Manager(){this.department = "unknow";}
    public Manager(String name, double salary, String department)
    {
        super.setName(name);
        super.setSalary(salary);
        this.department = department;
    }

    public void SetDepartment(String department){this.department = department;}
    public String getDapartment(){return this.department;}

    public String toString()
    {return "Employee name: " + super.getName() + "\n" +
            "Employee salary: " + super.getSalary() + "\n" +
            "Employee department: " + this.department;}
}
