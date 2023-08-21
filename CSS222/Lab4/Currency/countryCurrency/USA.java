package countryCurrency;

public class USA implements Currency {

    @Override
    public String getCurrency() {
        return "Dollar";
    }

    @Override
    public String getSymbol() {
        return "$";
    }

    @Override
    public void callMain() {
        main(null);
    }

    public static void main(String[] args) {
        
        USA temp = new USA();
        System.out.println("USA CURRENCY:");
        System.out.println(temp.getCurrency());
        System.out.println(temp.getSymbol());
    }

    @Override
    public double CurrencyValue() {
        double value = 1;
        return value;
    }

}
