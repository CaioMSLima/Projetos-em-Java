package Vetores;

import Vetores.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class VetoresParte2 {
   /* Fazer um programa para ler um número inteiro N e os dados (nome e
preço) de N Produtos. Armazene os N produtos em um vetor. Em
    seguida, mostrar o preço médio dos produtos.*/
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Produto[] vetor = new Produto[n];

        for(int i = 0; i < vetor.length ; i++){
            scan.nextLine();
            String nome = scan.nextLine();
            double preco = scan.nextDouble();
            vetor[i] = new Produto(nome,preco);
        }

        double soma = 0;
        for (int i = 0; i < vetor.length ; i++){
            soma += vetor[i].getPreco();
        }
        double media = soma/vetor.length;
        System.out.printf("Media de preço = %.2f%n",media);

}
}


