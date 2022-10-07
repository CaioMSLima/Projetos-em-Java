package ExerciciosPropostos;

import ExerciciosPropostos.Entitites.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
/*
        Fazer um programa para ler os valores da largura e altura
        de um retângulo. Em seguida, mostrar na tela o valor de
        sua área, perímetro e diagonal. Usar uma classe como
        mostrado no projeto ao lado*/

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter rectangle width and height:");

        Rectangle z = new Rectangle();
        z.width = scan.nextDouble();
        z.height = scan.nextDouble();

        double area = z.area();
        double perimeter = z.perimeter();
        double diagonal = z.diagonal();

        System.out.println("AREA = " + area);
        System.out.println("PERIMETER = " + perimeter);
        System.out.println("DIAGONAL = " + diagonal );


    }
}
