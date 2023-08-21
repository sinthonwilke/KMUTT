public class FullTimeWorker extends Worker
{
    private int hours_worked;

    public FullTimeWorker(String name, double salary_rate, int hours_worked)
    {
        super(name, salary_rate);
        this.hours_worked = hours_worked;
    }


    @Override
    public double computePay()
    {
        if (this.hours_worked >= 240) {return 240 * (100/super.getSalary_rate());}
        else {return hours_worked * (100/super.getSalary_rate());}
    }
}
