package Matrizes;

import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de n");
        int n = scan.nextInt();
        int[][] mate = new int[n][n];

        for(int i = 0; i<n;i++){
            for (int j = 0; j<n; j++){
                mate[i][j] = scan.nextInt();
            }
        }
        System.out.println(" ");
        System.out.println("Diagonal principal");
        for (int i = 0; i<n;i++){
            System.out.print(mate[i][i] + " ");
        }
        System.out.println(" ");
       
        int conta = 0;
        for(int i = 0; i<n;i++){
            for (int j = 0; j<n; j++) {
                if(mate[i][j] < 0){
                    conta++;
                }
            }
        }
        System.out.println("Numeros negativos: " + conta);
        scan.close();
    }
}