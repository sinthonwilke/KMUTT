import java.util.Scanner;

public class Keypad {
    public int getInput() {
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        return userInput;
    }
}
