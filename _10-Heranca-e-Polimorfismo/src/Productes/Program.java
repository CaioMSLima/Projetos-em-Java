package Productes;

import Productes.entities.ImportedProduct;
import Productes.entities.Product;
import Productes.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = scan.nextInt();

        List<Product> list = new ArrayList<>();

        for (int i = 1 ; i <= n ; i++){
            System.out.println("Product # " + i +"data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            scan.nextLine();
            String x = scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Price: ");
            Double price = scan.nextDouble();

            if (Objects.equals(x, "c")){
                list.add(new Product(name, price));
            }

            else if (Objects.equals(x, "i")){

                System.out.print("Customs fee: ");
                Double customsFree = scan.nextDouble();
                list.add(new ImportedProduct(name, price, customsFree));
            }

            else {

                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(scan.next());
                list.add(new UsedProduct(name, price, manufactureDate));

            }

        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product prod : list){

            System.out.println(prod.priceTag());
        }
        scan.close();
    }
}
