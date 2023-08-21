public class ATM {
    public boolean userAuthenticated = false;
    public static void main(String[] args) {
        BankDatabase bankDatabase = new BankDatabase();
        Screen screen = new Screen();
        CashDispenser cashDispenser = new CashDispenser(500);
        Withdrawal withdrawal = new Withdrawal();
        Deposit deposit = new Deposit();

        while(true) {
            int[] userInput = screen.displayWelcome();
            int userAccount = userInput[0];
            int userPIN = userInput[1];

            if(bankDatabase.authenticateUser(userAccount, userPIN)) {
                while(true) {
                int menuChoice = screen.displayMenu();
                if (menuChoice == 1) {
                    System.out.println("\n\tYour balance: " + bankDatabase.getAvailableBalance(userAccount));
                }
                else if(menuChoice == 2) {
                    while(true) {
                        int withdrawalChoice = screen.disPlayWithdrawal();
                        int cashWithdrawal;
                        if (withdrawalChoice == 1) {
                            cashWithdrawal = 20;
                            withdrawal.excute(userAccount, cashWithdrawal, cashDispenser, bankDatabase);
                            break;
                        }
                        else if (withdrawalChoice == 2) {
                            cashWithdrawal = 40;
                            withdrawal.excute(userAccount, cashWithdrawal, cashDispenser, bankDatabase);
                            break;
                        }
                        else if (withdrawalChoice == 3) {
                            cashWithdrawal = 60;
                            withdrawal.excute(userAccount, cashWithdrawal, cashDispenser, bankDatabase);
                            break;
                        }
                        else if (withdrawalChoice == 4) {
                            cashWithdrawal = 100;
                            withdrawal.excute(userAccount, cashWithdrawal, cashDispenser, bankDatabase);
                            break;
                        }
                        else if (withdrawalChoice == 5) {
                            cashWithdrawal = 200;
                            withdrawal.excute(userAccount, cashWithdrawal, cashDispenser, bankDatabase);
                            break;
                        }
                        else if (withdrawalChoice == 6) {
                            System.out.println("\n\tYou have been cancel.");
                            break;
                        }
                        else {
                            System.out.println("\n\tPlease select the right menu.");
                        }
                    }
                }
                else if(menuChoice == 3) {
                    int amount = screen.displayDeposit();
                    deposit.excute(userAccount, bankDatabase, amount);
                    System.out.println("\n\tSuccessful deposit.");
                }
                else if(menuChoice == 4) {
                    System.out.println("\n\tYou have been exit.");
                    break;
                }
                else {
                    System.out.println("\n\tPlease select the right menu.");
                }
            } 
            }
        }
    }
}
