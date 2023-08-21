public class Withdrawal {

    public void excute(int userAccount, int cashWithdrawal, CashDispenser cashDispenser, BankDatabase bankDatabase) {
        Screen screen = new Screen();
        if(cashDispenser.isSufficientCashAvailable(cashWithdrawal)) {
            bankDatabase.withdrawalBalance(userAccount, cashWithdrawal);
            cashDispenser.dispenseCash(cashWithdrawal);
            screen.displayRecive();
        }
        else {
            screen.displayCantWithdrawal();
        }
    }
}
