package classComponents;

public class Demo3 {
    public static void main(String[] args) {
        // accessing static variables with the ClassName
        System.out.println(Product.companyName);

        Product product = new Product();
        System.out.println(product.productId);
        System.out.println(product.productName);

        //changing the default values with some actual value
        product.productId = 1;
        product.productName = "Mobile";
        System.out.println("values changed");
        System.out.println(product.productId);
        System.out.println(product.productName);

        //local variable
        int number = 100;
        System.out.println(number);

    }
}
