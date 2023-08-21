public class HourlyWorker extends Worker
{
    private int hours_Worked;

    public HourlyWorker(String name, double salary_rate, int hours_Worked)
    {
        super(name, salary_rate);
        this.hours_Worked = hours_Worked;
    }


    @Override
    public double computePay()
    {
        if (this.hours_Worked >= 60) {return 60 * (50/super.getSalary_rate());}
        else {return hours_Worked * (50/super.getSalary_rate());}
    }
}
