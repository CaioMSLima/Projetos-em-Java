import Entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner scan = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = scan.nextLine();
        System.out.println("Price: ");
        product.price = scan.nextDouble();
        System.out.println("Quantity: ");
        product.quantity = scan.nextInt();

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = scan.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed in stock: ");
        quantity = scan.nextInt();
        product.removeProduts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);


    }
}
