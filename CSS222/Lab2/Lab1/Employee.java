public class Employee
{
    private String name;
    private double salary;


    public Employee()
    {
        this.name = "unknow";
        this.salary = -1;
    }
    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name){this.name = name;}
    public String getName(){return this.name;}

    public void setSalary(double salary){this.salary = salary;}
    public double getSalary(){return this.salary;}

    public String toString()
    {return "Employee name: " + this.name + "\n" +"Employee salary: " + this.salary;}
}