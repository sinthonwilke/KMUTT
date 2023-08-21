public class BankDatabase {

    public Account account = new Account(123456789, 1234, 10000, 10000);

    public boolean authenticateUser(int userAccountNumber, int userPIN) {

        if (userAccountNumber == account.getAccountNumber() && userPIN == account.getAccountPIN()) {
            return true;
        }
        return false;
    }
    

    public double getAvailableBalance(int userAccountNumber) {
        return account.getAvailableBalance();
    }

    public double getTotalBalance(int userAccountNumber) {
        return account.getTotalBalance();
    }

    public void credit(int userAccountNumber, Double amount) {

    }

    public void debit(int userAccountNumber, Double amount) {

    }

    public void withdrawalBalance(int userAccountNumber, int withdrawal) {
        account.setAvailableBalance(account.getAvailableBalance() - withdrawal);
    }

    public void depositBalance(int userAccountNumber, int deposit) {
        account.setAvailableBalance(account.getAvailableBalance() + deposit);
    }
}
