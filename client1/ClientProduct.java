package client1;

import java.util.Scanner;

import mainpackage.Product;
import mainpackage.ProductFactory;

public class ClientProduct {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Product Name: ");
    String pName = scanner.nextLine();
    System.out.println("Enter the Product Value: ");
    double pValue = scanner.nextDouble();

    ProductFactory productfactory = new ProductFactory();
    Product product1 = productfactory.createProduct(pName, pValue);

    System.out.println("Enter the Product Quantity: ");
    int quantity = scanner.nextInt();
    System.out.println("Enter the Selling Price: ");
    double sPrice = scanner.nextDouble();
    product1.calculateProfitOrLoss(quantity, sPrice);

    System.out.println("Enter the Product Commission");
    double commission = scanner.nextDouble();
    product1.calculateCommission(commission);

    System.out.println("Enter the Product Purchase Price");
    double purchasePrice = scanner.nextDouble();
    product1.purchase(purchasePrice);

    scanner.close();
  }
}
