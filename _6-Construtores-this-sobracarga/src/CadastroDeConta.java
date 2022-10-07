import entities.Informacoes;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class CadastroDeConta {
    public static void main(String[] args) {
        /*Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
            titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
        inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
        conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
        Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
        o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
        exemplo).
        Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
        isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
        realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
        suficiente para realizar o saque e/ou pagar a taxa.
        Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
        informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
        mostrando os dados da conta após cada operação.*/

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int numeroConta = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter account holder: ");
        String nome = scan.nextLine();
        Informacoes conta;

        System.out.println("Is there na initial deposit (y/n)? y ");
        String opcao = scan.nextLine();

        if (Objects.equals(opcao, "y")){
            System.out.println("Enter initial deposit value: " );
            double valorInicial = scan.nextDouble();
             conta = new Informacoes(numeroConta,  nome, valorInicial);
        }
        else {
            conta = new Informacoes(numeroConta,  nome);
        }


        System.out.println();
        System.out.println("Account data: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("Enter a deposit value: ");
        double valorDeposito = scan.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Updated account data:");
        System.out.println(conta);

        System.out.println();
        System.out.println("Enter a withdraw value");
        double valorSaque = scan.nextDouble();
        conta.saque(valorSaque);
        System.out.println("Updated account data:");
        System.out.println(conta);












    }
}
