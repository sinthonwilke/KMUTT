public class Main {
    public static void main(String[] args)
    {
        System.out.println("m1");
        Manager m1 = new Manager();
        System.out.println(m1);

        System.out.println("\n" + "m2");

        Manager m2 = new Manager("Richard", 1000000, "Something");
        System.out.println(m2);
    }
}
