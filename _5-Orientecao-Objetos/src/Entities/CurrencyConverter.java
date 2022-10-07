package Entities;

public class CurrencyConverter {

    public static final double IDF = 0.06;

    public static double dollarToReal(double amount,double dollarPrice){
        return  (amount * dollarPrice)*(1 + IDF);
    }

}
