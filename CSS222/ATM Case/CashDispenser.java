public class CashDispenser {

    private int count;

    public CashDispenser(int count) {
        this.count = count;
    }
    public void dispenseCash(int cash) {
        count = count - cash;
    }
    public boolean isSufficientCashAvailable(int cash) {
        if (cash < count) {
            return true;
        }
        return false;
    }
}
