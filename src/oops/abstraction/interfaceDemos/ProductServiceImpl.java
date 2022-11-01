package oops.abstraction.interfaceDemos;

public  class ProductServiceImpl implements ProductService{
    @Override
    public void addProduct() {
        System.out.println("add product override");
    }

    public static void main(String[] args) {
        ProductService productService = new ProductServiceImpl();
        productService.addProduct();
    }
}
