import java.util.Scanner;
public class LabUnit3 {
    public static void main(String[] args)
    {
        Scanner scaner = new Scanner(System.in);
        System.out.print("Enter celcius: ");
        int c = scaner.nextInt();
        double f = (9.0 / 5.0) * c + 32;
        System.out.println("Fahrenheit = " + f);

        scaner.close();
    }
}