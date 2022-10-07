package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class VetoresParte1 {
    public static void main(String[] args) {
        /*Fazer um programa para ler um número inteiro N e a altura de N
        pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
        altura média dessas pessoas*/

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        int n = scan.nextInt();
        double[] vetor = new double[n] ;

        for(int i = 0; i < n; i++){
            vetor[i] = scan.nextDouble();

        }

        double sum = 0.0;
        for (int i = 0; i< n;i++){
            sum += vetor[i];
        }
        double media = sum / n;
        System.out.printf("A media de altura é de %.2f ",media);
        scan.close();
    }
}
