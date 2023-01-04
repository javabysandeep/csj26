package classComponents.constructor;

public class Product {
    int productId;
    String productName;
    int productPrice;

    //zero param
    public Product(){
        productId = 1;
        productName = "dummy";
        productPrice= 10;
//        System.out.println("developer provided con");
    }


    public Product(int pId, String pName, int pPrice) {
        productId = pId;
        productName = pName;
        productPrice = pPrice;
    }

    public Product(int productId) {
        this.productId = productId;
    }

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public Product(int productId, int productPrice) {
        this.productId = productId;
        this.productPrice = productPrice;
    }
}








