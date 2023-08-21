class BicycleRegistration
{
    public static void main(String[] args)
    {
        Bicycle bike1, bike2;
        String owner1, owner2, tag1, tag2;

        bike1 = new Bicycle();
        bike2 = new Bicycle();

        bike1.setOwnerName("Adam Smith");
        bike2.setOwnerName("Ben Jones");

        bike1.setTagNo("2004-134R");
        bike2.setTagNo("NCC-1701");

        owner1 = bike1.getOwnerName();
        owner2 = bike2.getOwnerName();

        tag1 = bike1.getTagNo();
        tag2 = bike2.getTagNo();


        System.out.println(owner1 + " owns bike1.");
        System.out.println("bike1's tag number: " + tag1);

        System.out.println(owner2 + "owns bike2");
        System.out.println("bike2's tag number: " + tag2);
    }
}
