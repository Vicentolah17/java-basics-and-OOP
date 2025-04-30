package application;
import java.util.Locale;
import java.util.Scanner;
import entities.CurrencyConverter;

public class Dolar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        CurrencyConverter.dprice = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        CurrencyConverter.dbought = sc.nextDouble();
        System.out.println("Amount to pay in R$: ");
        System.out.printf("%.2f", CurrencyConverter.reaisPagos(CurrencyConverter.dprice, CurrencyConverter.dbought));

    }
}
