class Animal
{
    public void animalSound()
    {
        System.out.println(("The animal makes a sound"));
    }    
}

class Pig extends Animal
{
    public void animalSound()
    {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal
{
    public void animalSound()
    {
        System.out.println("the dog says: bow bow");
    }
}

class ExamplePolymorphism
{
    public static void main(String[] args)
    {
        Animal myAnimal = new Animal();
        Animal mypig = new Pig();
        Animal myDog = new Dog();
        myAnimal.animalSound();
        mypig.animalSound();
        myDog.animalSound();
    }
}
