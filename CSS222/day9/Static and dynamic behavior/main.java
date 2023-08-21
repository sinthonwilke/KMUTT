class Animal
{
    public void speak () {System.out.println("Animal Speak !");}
}

class Dog extends Animal
{
    public void speak() {bark();}
    public void bark() {System.out.println("Woof !");}
}

class Seal extends Animal
{
    public void speak() {bark();}
    public void bark() {System.out.println("Arf !");}
}

class Bird extends Animal
{
    public void speak() {System.out.println("Tweet !");}
}

class main
{
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal seal = new Seal();
        Animal bird = new Bird();

        animal.speak();
        dog.speak();
        seal.speak();
        bird.speak();
    }
}
