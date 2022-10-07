package Contas;

import Contas.entidades.Account;
import Contas.entidades.BusinessAccount;
import Contas.entidades.SavingsAccount;

public class Program {
    public static void main(String[] args) {

       /* Account acc = new Account(1300, "Alex", 0.0); da erro pq a funçao abstratic esta ativa e ela nao pode ser intanciada */
        BusinessAccount bacc = new BusinessAccount(6000, "Maria", 0.0, 5000.0);

        // UPCASTING
        Account acc1 = bacc;
        acc1.getBalance();
        Account acc2 = new BusinessAccount(4200, "Michael", 23.0, 4000.00);
        Account acc3 = new SavingsAccount(7900, "Carlos", 0.0, 690.50);

        //DOWCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(140.0);

        //BusinessAccount acc5= (BusinessAccount) acc3;

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");


        }

        //Sobreposição
       /* Account acc6 = new Account(1020,"Gazela",1000.0);*/
        Account acc7 = new SavingsAccount(7701,"Zebra",1000.0,0.01);
        acc7.withdraw(200);
        System.out.println(acc7.getBalance());

        Account acc8 = new BusinessAccount(7706,"Tigre",1000.0,500.0);
        acc8.withdraw(200);
        System.out.println(acc8.getBalance());

        //Polimorfismo

        /*Account x = new Account(1020,"Fotom",1000.0);*/
        Account y = new SavingsAccount(1025,"Atomo",1000.0 ,0.01);

       /* x.withdraw(50.0);*/
        y.withdraw(50.0);

     /*   System.out.println(x.getBalance());*/
        System.out.println(y.getBalance());
    }
}
