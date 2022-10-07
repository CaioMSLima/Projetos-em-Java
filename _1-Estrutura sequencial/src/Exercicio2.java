import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        int a = 25;
        double b, c;
        b = 100;
        c = 5.50;

        System.out.println("NUMBER = " + a);
        System.out.printf("SALARY = %.2f %n",(b*c));
        System.out.println("");

        System.out.println("Produto 1");
        Scanner scan = new Scanner(System.in);

       int codigo;
        double qtd, preco;
        codigo = scan.nextInt();
        qtd = scan.nextDouble();
        preco = scan.nextDouble();

        System.out.println("Produto 2");

        int codigo2;
        double qtd2, preco2;
        codigo2 = scan.nextInt();
        qtd2 = scan.nextDouble();
        preco2 = scan.nextDouble();

        System.out.println("VALOR A PAGAR: "+ ((  qtd * preco) + (qtd2 * preco2)));

        double raio;
        System.out.println("Raio");
        raio = scan.nextDouble();
        Double pi =  3.14159;

        System.out.printf("A área do circulo = %.4f%n",(pi * Math.pow(raio,2)));


    }
}
