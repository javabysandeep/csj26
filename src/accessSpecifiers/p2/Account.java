package accessSpecifiers.p2;

import accessSpecifiers.p1.Order;

public class Account {
    int accountNumber;
    public String accountType;
    private int accountBalance;

    public void deposit(){}
    void getBalance(){}

    public static void main(String[] args) {
        Order order=  new Order();
//        System.out.println(order.orderNumber);
        order.createOrder();
       // order.addItem();
    }
}
