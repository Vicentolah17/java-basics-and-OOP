package application;
import entities.Product2;
import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product2 p = new Product2();
        System.out.println("Enter product data: ");
        System.out.print("Name:");
        p.name = sc.nextLine();
        System.out.print("Price:");
        p.price = sc.nextDouble();
        System.out.print("Quantity in stock:");
        p.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data:" + p);

        System.out.println();
        System.out.print("Enter the numbers of products you want to add: ");
        int quantity = sc.nextInt();
        p.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data:" + p);

        System.out.println();
        System.out.print("Enter the numbers of products you want to remove: ");
        quantity = sc.nextInt();
        p.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data:" + p);

        sc.close();
    }
}