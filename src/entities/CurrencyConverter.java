package entities;

public class CurrencyConverter {
    public static double dprice;
    public static double dbought;


    public static double reaisPagos(double dprice, double dbought){
        return dprice*dbought * 1.06;
    }

}
