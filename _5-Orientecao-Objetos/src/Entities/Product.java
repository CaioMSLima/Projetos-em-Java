package Entities;

public class Product {
    public String name;
    public double price;
    public double quantity;

    public double totalValueInStock(){
        return quantity * price;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProduts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name
                + ", $ "
                + String.format("%.2f", price)
                +", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());

    }
}
