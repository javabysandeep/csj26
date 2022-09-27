package classComponents;

public class Demo2 {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        Product product4 = new Product();
        Product product5 = new Product();

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);
        System.out.println(product5);

        System.out.println("Assign actual values");

        //replacing default values with actual values.
        product1.productId = 1;
        product1.productName= "Laptop";
        System.out.println(Product.companyName);

    }
}
