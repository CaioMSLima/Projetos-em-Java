package Taxes;

import Taxes.entities.Company;
import Taxes.entities.Individual;
import Taxes.entities.TaxPayer;

import java.util.*;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = scan.nextInt();

        List <TaxPayer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++){

            System.out.println("Tax payer #" + i + " Data: ");
            System.out.print("Individual or company (i/c)? ");
            scan.nextLine();
            String x = scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Anual income: ");
            Double anualIcome = scan.nextDouble();

            if(Objects.equals(x,"i")){

                System.out.print("Health expenditures: ");
                Double healthExpenditures = scan.nextDouble();

                list.add(new Individual(name, anualIcome, healthExpenditures));
            }

            else {

                System.out.print("Number of employees: ");
                int  employeeNumber = scan.nextInt();

                list.add(new Company(name, anualIcome, employeeNumber));

            }


            System.out.println("\n TAXES PAID:");
            double total = 0;

            for (TaxPayer payer : list){
                total += payer.taxValue();
                System.out.println(payer.getName()  + String.format(": $ %.2f", payer.taxValue()));
            }

            System.out.println(" \n TOTAL TAXES: $ " + total);


        }
    }

}
