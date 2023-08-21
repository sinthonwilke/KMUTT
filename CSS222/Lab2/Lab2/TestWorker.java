public class TestWorker {
    public static void main(String[] args)
    {
        FullTimeWorker ftw = new FullTimeWorker("Abby", 5, 180);
        System.out.println
            (
            "name: " + ftw.getName() + "\n" +
            "salary_rate: " + ftw.getSalary_rate() + "\n" +
            "Pay: " + ftw.computePay() 
            );

        System.out.println();

        HourlyWorker hw = new HourlyWorker("Bobby", 4, 45);
        System.out.println
            (
            "name: " + hw.getName() + "\n" +
            "salary_rate: " + hw.getSalary_rate() + "\n" +
            "Pay: " + hw.computePay() 
            );
    }
}
