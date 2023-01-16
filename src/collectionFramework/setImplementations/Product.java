package collectionFramework.setImplementations;

public class Product /*implements Comparable<Product>*/ {
    private int productId;
    private int productQuantity;
    private int productPrice;
    private String productTitle;

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productQuantity=" + productQuantity +
                ", productPrice=" + productPrice +
                ", productTitle='" + productTitle + '\'' +
                '}';
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public Product(int productId, int productQuantity, int productPrice, String productTitle) {
        this.productId = productId;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
        this.productTitle = productTitle;
    }

   /* @Override
    public int compareTo(Product product) {
        return this.productId - product.productId;
    }*/
}
