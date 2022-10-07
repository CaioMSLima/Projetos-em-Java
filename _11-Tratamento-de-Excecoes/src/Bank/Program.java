package Bank;

import Bank.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        try {

            Locale.setDefault(Locale.US);
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = scan.nextInt();
            scan.nextLine();
            System.out.print("Holder: ");
            String holder = scan.nextLine();
            System.out.print("Initial balance: ");
            Double  balance = scan.nextDouble();
            System.out.print("Withdraw limit: ");
            Double  winthdrawLimit = scan.nextDouble();

            Account conta = new Account(number, holder, balance, winthdrawLimit);

            System.out.print("\nEnter amount for withdraw:");
            Double winthdraw = scan.nextDouble();
            conta.Winthdraw(winthdraw);
            System.out.print("New balance: " + conta.getBalance());

        } catch (RuntimeException e2){
            System.out.println("Unexpected erro");

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
