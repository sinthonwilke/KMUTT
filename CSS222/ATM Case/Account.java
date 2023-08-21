public class Account {

    private int accountNumber;
    private int accountPIN ;
    private double availableBalance;
    private double totalBalance;


    public Account(int accountNumber, int accountPIN, double availableBalance, double totalBalance) {
        this.accountNumber = accountNumber;
        this.accountPIN = accountPIN;
        this.availableBalance = availableBalance;
        this.totalBalance = totalBalance;
    }


    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountPIN() {
        return accountPIN;
    }


    public double getAvailableBalance() {
        return availableBalance;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public boolean validatePIN() {
        return true;
    }

    public void credit() {

    }

    public void debit() {
        
    }
}
