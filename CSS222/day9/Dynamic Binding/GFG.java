public class GFG
{
    public static class superclass
    {
        void print()
        {
            System.out.println("print in superclass is called");
        }
    }
    public static class subclass extends superclass
    {
        @Override void print()
        {
            System.out.println("print is subclass is called");
        }
    }


    public static void main(String[] args)
    {
        superclass A = new superclass();
        superclass B = new subclass();
        
        A.print();
        B.print();
    }
}
