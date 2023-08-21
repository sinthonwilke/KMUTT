package seatClass;

import countryCurrency.Currency;

public interface Seat {

    public String fares(boolean wifi, boolean tv, int wine, Currency currency);

}
