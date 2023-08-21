abstract public class Worker
{
    private String name;
    private Double salary_rate;
    
    public Worker(String name, Double salary_rate)
    {
        this.name = name;
        this.salary_rate = salary_rate;
    }

    public String getName(){return this.name;}
    public Double getSalary_rate(){return this.salary_rate;}
    abstract public double computePay();
}