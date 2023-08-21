package seatClass;

import countryCurrency.Currency;

public class Business implements Seat{
    
    @Override
    public String fares(boolean wifi, boolean tv, int wine, Currency currency) {
        double total = 4500;
        if (wifi) {
            total += 10;
        }
        if (tv) {
            total += 50;
        }
        if (wine > 0) {
            total += 30 * wine;
        }

        return "Business class fare: " + (total * currency.CurrencyValue()) + currency.getSymbol() + " or (" + total + "$)";
    }
}
