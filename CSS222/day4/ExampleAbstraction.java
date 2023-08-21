abstract class Animal
{
    public abstract void animalSound();
    public void Sleep()
    {
        System.out.println("Zzz");
    }
}

class Pig extends Animal
{
    public void animalSound()
    {
        System.out.println("The pig says: wee wee");
    }
}

public class ExampleAbstraction {
    public static void main(String[] args)
    {
        Pig mypPig = new Pig();
        mypPig.animalSound();
        mypPig.Sleep();    
    }
}
