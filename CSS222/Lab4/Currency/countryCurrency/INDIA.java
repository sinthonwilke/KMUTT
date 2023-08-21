package countryCurrency;

public class INDIA implements Currency {

    @Override
    public String getCurrency() {
        return "Rupee";
    }

    @Override
    public String getSymbol() {
        return "₹";
    }

    @Override
    public void callMain() {
        main(null);
    }

    public static void main(String[] args) {
        
        INDIA temp = new INDIA();
        System.out.println("INDIA CURRENCY:");
        System.out.println(temp.getCurrency());
        System.out.println(temp.getSymbol());

    }

    @Override
    public double CurrencyValue() {

        double value = 81.64;
        return value;
    }
}
