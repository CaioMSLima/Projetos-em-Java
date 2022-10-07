import java.util.Scanner;

public class Exercio1 {
    public static void main(String[] args) {

        System.out.println("Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.\n");

        int x = -10;

        if (x < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("POSITIVO");
        }

        System.out.println(" Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.\n");
        int z = 0;

        if ((z % 2) == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        System.out.println(" Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem \"Sao Multiplos\" ou \"Nao sao\n" +
                " Multiplos, indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.\n");
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        if (((a % b) == 0) || ((b % a) == 0)) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");


            System.out.println("\n  Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode\n" +
                    "começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.");

            int horaInicial = scan.nextInt();
            int horaFinal = scan.nextInt();

            int duracao;
            if (horaInicial < horaFinal) {
                duracao = horaFinal - horaInicial;
            } else {
                duracao = 24 - horaInicial + horaFinal;
            }

            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");


            System.out.println("\n Escreva um programa que leia o código de um item e a quantidade deste item. A\n" +
                    "seguir, calcule e mostre o valor da conta a pagar.");

            Double codigo = scan.nextDouble();
            Double qtd = scan.nextDouble();

            if (codigo == 1) {
                System.out.println("O valor total da compra foi de R$ " + (qtd * 4));
            } else if (codigo == 2) {
                System.out.println("O valor total da compra foi de R$ " + (qtd * 4.50));
            } else if (codigo == 3) {
                System.out.println("O valor total da compra foi de R$ " + (qtd * 5));
            } else if (codigo == 4) {
                System.out.println("O valor total da compra foi de R$ " + (qtd * 2));
            } else if (codigo == 5) {
                System.out.println("O valor total da compra foi de R$ " + (qtd * 1.50));
            }

            System.out.println("\n Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra.\n" +
                    "Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.");

            double h = scan.nextDouble();
            String intervalo;

            if ((h >= 0) && (h <= 25)) {
                intervalo = "pertemce ao intervalo de [0,25]";
            } else if ((h > 25) && (h <= 50)) {
                intervalo = "pertemce ao intervalo de (25,50]";
            } else if ((h > 50) && (h <= 75)) {
                intervalo = "pertemce ao intervalo de (50,75]";
            } else if ((h > 75) && (h <= 100)) {
                intervalo = "pertemce ao intervalo de (75,100]";
            } else {
                intervalo = "Não tem intervalo";
            }
            System.out.println("O numero " + intervalo);

        }
    }
}
