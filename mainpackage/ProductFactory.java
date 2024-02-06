package mainpackage;

public class ProductFactory {
  public Product createProduct(String pName, double pVlaue) {
    Product p1 = new Product(pName, pVlaue);
    return p1;
  }
}
