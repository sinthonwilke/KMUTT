class NewClass
{
    public static class superclass
    {
        static void print()
        {
            System.out.println("print() in superclass is called");
        }
    }

    public static class subclass extends superclass
    {
        static void print()
        {
            System.out.println("print() in subclass is called");
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
