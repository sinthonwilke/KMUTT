package Lecture;
public class ArrayTest {
    public static void main(String[] args)
    {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println("Index 0 of cars array is " + cars[0]);

        int[] age = {10, 20, 30, 40};
        System.out.println("Index 0 of age array is " + age[0]);

        cars[0] = "Honda";
        System.out.println("Change element 0 of cars array to" + cars[0]);

        System.out.println("Length of cars array is " + cars.length);

        for (int i = 0; i < cars.length; i++)
        {
            System.out.println(cars[i]);
        }
    }
    
}
