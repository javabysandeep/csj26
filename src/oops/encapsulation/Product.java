package oops.encapsulation;

public class Product {
    private int productId;
    private String productName;
    private int productQuantity;
    private int productPrice;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    public Product() {
    }

    public Product(int productId, String productName, int productQuantity, int productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setAge(30);
        employee.setEmployeeName("Sachin");
        employee.setEmployeeId(1);
        employee.setEmployeeSalary(3000);

        System.out.println(employee.getEmployeeId());
        System.out.println(employee.getEmployeeName());
        System.out.println(employee.getAge());
        System.out.println(employee.getEmployeeSalary());
    }
}
