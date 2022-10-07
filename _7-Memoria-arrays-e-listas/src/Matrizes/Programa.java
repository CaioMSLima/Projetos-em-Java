package Matrizes;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        /*Fazer um programa para ler dois números inteiros M e N, e depois ler
        uma matriz de M linhas por N colunas contendo números inteiros,
                podendo haver repetições. Em seguida, ler um número inteiro X que
        pertence à matriz. Para cada ocorrência de X, mostrar os valores à
        esquerda, acima, à direita e abaixo de X, quando houver, conforme
        exemplo.*/

        Scanner scan = new Scanner(System.in);
        int m, n;

        m = scan.nextInt();
        n = scan.nextInt();
        int[][] matriz = new int[m][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int w = 0; w < matriz[i].length; w++) {
                matriz[i][w] = scan.nextInt();
            }
        }
        int x = scan.nextInt();
        for (int i = 0; i < matriz.length; i++) {
            for (int w = 0; w < matriz[i].length; w++) {
                if (matriz[i][w] == x){
                    System.out.println();
                    System.out.println("Posição: " + i + "," + w + ":");
                    if(w > 0){
                        System.out.println("Esquerda: ; " +  matriz[i][w - 1]);
                    }
                    if(w < matriz[i].length - 1){
                        System.out.println("Direita: "+ matriz[i][w + 1]);
                    }
                    if(i>0){
                        System.out.println("Em cima: " + matriz[i - 1][w] );
                    }
                    if(i < matriz.length - 1){
                        System.out.println("Em baixo: " + matriz[i + 1][w]);
                    }

                }


            }

        }

    }

}