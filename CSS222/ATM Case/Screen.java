public class Screen {

    public Keypad keypad = new Keypad();

    public int[] displayWelcome() {
        int[] userInput = new int[2];
        System.out.println("\n#################################################");
        System.out.println("Welcome!");
        System.out.print("Please enter your account number: ");
        int userAccountInput = keypad.getInput();
        System.out.print("Enter your PIN: ");
        int userPinInput = keypad.getInput();
        System.out.println("#################################################");
        userInput[0] = userAccountInput;
        userInput[1] = userPinInput;
        return userInput;
    }

    public int displayMenu() {
        System.out.println("\n#################################################");
        System.out.println("Main menu");
        System.out.println("\t1 - View my balance");
        System.out.println("\t2 - Withdraw cash");
        System.out.println("\t3 - Deposit funds");
        System.out.println("\t4 - Exit");
        System.out.println("Enter a choice:");
        int choice = keypad.getInput();
        System.out.println("#################################################");
        return choice;
    }

    public int disPlayWithdrawal() {
        System.out.println("\n#################################################");
        System.out.println("Withdrawal menu");
        System.out.print("\t1 - $20");    System.out.println("\t4 - $100");
        System.out.print("\t2 - $40");    System.out.println("\t5 - $200");
        System.out.print("\t3 - $60");    System.out.println("\t6 - Cancel");
        System.out.println("Choose a withdrawal amount:");
        int choice = keypad.getInput();
        System.out.println("#################################################");
        return choice;
    }

    public int displayDeposit() {
        System.out.println("\n#################################################");
        System.out.println("\nplease insert any amount of money into the deposit slot:");
        int amount = keypad.getInput();
        System.out.println("#################################################");
        return amount;
    }

    public void displayRecive() {
        System.out.println("\n\tReceive your money at the deposit slot:");
    }

    public void displayCantWithdrawal() {
        System.out.println("\n\tDeposit Failed: ATM doesn't have sufficient cash available. Please come back later.");
    }
}
