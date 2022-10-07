import Entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class OrientacaoObjeto {
    /*Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
      válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
      possui a maior área.*/
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: \n");
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();
        System.out.println("Enter the measures of triangle Y: \n");
        y.a = scan.nextDouble();
        y.b= scan.nextDouble();
        y.c = scan.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }
        scan.close();
    }
}
