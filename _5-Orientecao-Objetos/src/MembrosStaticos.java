import Entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class MembrosStaticos {
    public static void main(String[] args) {

        /*Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
        uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
        que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
        para ser responsável pelos cálculos
        */
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in) ;

        System.out.println("What is the dollar price? ");
        double dollarPrice = scan.nextDouble();
        System.out.println("How many dollars will be bought? ");
        double amount = scan.nextDouble();
        double result =  CurrencyConverter.dollarToReal(amount,dollarPrice);

        System.out.println("Amount to be paid in reais = " + result);


    }
}
