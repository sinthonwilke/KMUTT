class A {public int a = 100;}
class B extends A {public int a = 80;}
class C extends B {public int a = 60;}
class D extends C {public int a = 40;}
class E extends D
{
    public int a = 10;
    public void show()
    {
        int a = 0;
        System.out.println(a);
    }
}

class Ex3Test
{
    public static void main(String[] args)
    {
        new E().show();
        A a1 = new E();
        D d1 = (D) a1;
    }
}