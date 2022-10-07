package Geometry;

import Geometry.entities.Circle;
import Geometry.entities.Color;
import Geometry.entities.Rectangle;
import Geometry.entities.Shape;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.*;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = scan.nextInt();
        List<Shape> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {

            System.out.println("Shape #" + i + " data:");
            scan.nextLine();
            System.out.print("Rectangle or Circle (r/c)? ");
            String shape = scan.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = scan.nextLine();

            if (Objects.equals(shape, "r")) {
                System.out.print("Width: ");
                double width = scan.nextDouble();
                System.out.print("height: ");
                double height = scan.nextDouble();
                list.add(new Rectangle(Color.valueOf(color), width, height));

            } else {
                System.out.print("Radius: ");
                double radius = scan.nextDouble();
                list.add(new Circle(Color.valueOf(color), radius));
            }

        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : list) {
            System.out.println(String.format("%.2f ",shape.area()));
        }
    }

}
