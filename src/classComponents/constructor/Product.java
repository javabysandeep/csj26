package classComponents.constructor;

public class Product {
    int productId;
    String productName;
    int productPrice;

    //zero param con
    public Product() {
        System.out.println("zero param");
    }

    //parameterized constructor
    public Product(int productId, String productName, int productPrice) {

    }
}
