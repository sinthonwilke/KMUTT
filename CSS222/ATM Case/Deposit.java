public class Deposit {
    public void excute(int userAccount, BankDatabase bankDatabase, int amount) {
        bankDatabase.depositBalance(userAccount, amount);
    }
}
