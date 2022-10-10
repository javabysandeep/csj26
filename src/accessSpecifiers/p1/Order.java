package accessSpecifiers.p1;

import accessSpecifiers.p2.Account;

public class Order {
    private int orderNumber;

    public void createOrder() {
    }

    private void addItem() {
    }

    public static void main(String[] args) {
        Account account = new Account();
        // System.out.println(account.accountNumber);
        //System.out.println(account.accountBalance);
        System.out.println(account.accountType);
        account.deposit();
        //account.getBalance();
    }

}
