import countryCurrency.Currency;
import countryCurrency.INDIA;
import countryCurrency.THAILAND;
import countryCurrency.USA;
import seatClass.Business;
import seatClass.Economy;
import seatClass.FirstClass;
import seatClass.PremiumEconomy;
import seatClass.Seat;

public class CurrencyFactory {
    

    public static Currency getCurrencyByCountry(String cnty) throws Exception {

        switch (cnty) {
            case "USA":
                USA usa = new USA();
                return usa;    
            case "INDIA":
                INDIA india = new INDIA();
                return india;
            case "THAILAND":
                THAILAND thailand = new THAILAND();
                return thailand;
            default:
                return null;
        }
    }
    public static void main(String[] args) throws Exception {

        Currency usa = getCurrencyByCountry("USA");
        usa.callMain();

        Currency india = getCurrencyByCountry("INDIA");
        india.callMain();

        Currency thailand = getCurrencyByCountry("THAILAND");
        thailand.callMain();

        Seat ecoSeat = new Economy();
        System.out.println("Economy class fare: " + ecoSeat.fares(false, false, 5, india));

        Seat premSeat = new PremiumEconomy();
        System.out.println("Premium Economy class fare: " + premSeat.fares(false, true, 2 , thailand));

        Seat firstSeat = new FirstClass();
        System.out.println("First class fare: " + firstSeat.fares(true, false, 1, usa));

        Seat busSeat = new Business();
        System.out.println("Business class fare: " + busSeat.fares(true, true, 3, thailand));

    }
}
