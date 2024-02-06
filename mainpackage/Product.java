package mainpackage;

public class Product {
  private String productName;
  private double productValue;

  public Product(String pName, double pValue) {
    productName = pName;
    productValue = pValue;
  }

  public void calculateProfitOrLoss(int quantity, double sellingPrice) {
    double difference = productValue - sellingPrice;
    double profitOrLoss = quantity * difference;
    if (profitOrLoss > 0)
      System.out.println("The Loss Value is: " + profitOrLoss);
    else
      System.out.println("The Profit Value is" + Math.abs(profitOrLoss));
  }

  public void purchase(double purchasePrice) {
    System.out.println("The Purchased Product is: " + productName);
    System.out.println("The value of a Product is: " + productValue);
    System.out.println("The Pruchased Value is: " + purchasePrice);
  }

  public void calculateCommission(double commissionRate) {
    double cr = productValue * commissionRate;
    System.out.println("The Commission Rate is: " + cr);
  }

  public void setName(String pName) {
    productName = pName;
  }

  public void setValue(double pValue) {
    productValue = pValue;
  }

  public String getName() {
    return productName;
  }

  public double getValue() {
    return productValue;
  }
}
