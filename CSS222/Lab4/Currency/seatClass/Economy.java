package seatClass;

import countryCurrency.Currency;

public class Economy implements Seat{

    @Override
    public String fares(boolean wifi, boolean tv, int wine, Currency currency) {
        double total = 2500;
        if (wifi) {
            total += 10;
        }
        if (tv) {
            total += 50;
        }
        if (wine > 0) {
            total += 30 * wine;
        }

        return "Economy class fare: " + (total * currency.CurrencyValue()) + currency.getSymbol() + " or (" + total + "$)";
    }
    
}
