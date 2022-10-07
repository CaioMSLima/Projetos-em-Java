package Vetores;

import Vetores.entities.Pensao;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        /*A dona de um pensionato possui dez quartos para alugar para estudantes,
        sendo esses quartos identificados pelos números 0 a 9.
        Fazer um programa que inicie com todos os dez quartos vazios, e depois
        leia uma quantidade N representando o número de estudantes que vão
        alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
        N estudantes. Para cada registro de aluguel, informar o nome e email do
            estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
        que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
        um relatório de todas ocupações do pensionato, por ordem de quarto,
                conforme exemplo.*/

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Pensao[] quartos = new Pensao[10];
        System.out.print("Quantos quartos serao alugados? ");
        int n = scan.nextInt();

        for (int i = 0; (i < n) ; i++) {

            System.out.printf("%nAluguel #%d: %n", (i + 1));
            System.out.print("Nome: ");
            scan.nextLine();
            String nome = scan.nextLine();
            System.out.print("Email: ");
            String email = scan.nextLine();
            System.out.print("Quarto: ");
            int quarto = scan.nextInt();
            System.out.println();
            quartos[quarto] = new Pensao(nome, email, quarto);
        }
        System.out.println("Quartos ocupados:");
        for (int i = 0;  i < 10; i++){
            if (quartos[i] != null){
                System.out.println(quartos[i]);
            }

        }
    }
}