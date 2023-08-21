package countryCurrency;

public class THAILAND implements Currency {

    @Override
    public String getCurrency() {
        return "Bath";
    }

    @Override
    public String getSymbol() {
        return "฿";
    }

    @Override
    public void callMain() {
        main(null);
    }

    public static void main(String[] args) {
        
        THAILAND temp = new THAILAND();
        System.out.println("THAILAND CURRENCY:");
        System.out.println(temp.getCurrency());
        System.out.println(temp.getSymbol());
    }

    @Override
    public double CurrencyValue() {
        double value = 35.55;
        return value;
    }

}
