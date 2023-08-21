package Lecture;
import java.util.Scanner;

public class ConditionTest {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter current hour (24) : ");
        int hour = input.nextInt();

        if (hour < 12)
        {
            System.out.println("Good morning.");
        }
        else if (hour < 16)
        {
            System.out.println("Good  day.");
        }
        else 
        {
            System.out.println("Good evening.");
        }
        input.close();
    }
}
