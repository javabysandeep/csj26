package collectionFramework.listImplementations;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        List<Account> accountList = new ArrayList();
        Account account1 = new Account(1, "A", 100.0f);
        Account account2 = new Account(2, "B", 90.0f);
        Account account3 = new Account(3, "C", 1780.0f);
        Account account4 = new Account(11, "E", 18f);
        Account account5 = new Account(21, "xyz", 1f);
        Account account6 = new Account(12, "cd", 5f);

        accountList.add(account1);
        accountList.add(account2);
        accountList.add(account3);
        accountList.add(account4);
        accountList.add(account5);
        accountList.add(account6);

        // find the accounts whose balance is greater than 100
        for (Account account : accountList) {
            if (account.getAccountBalance() <= 100f) {
                System.out.println(account);
            }
        }

        // java 8 way
        accountList
                .stream()
                .filter(account -> account.getAccountBalance() <= 100)
                .forEach(System.out::println);

        System.out.println("Java 7 way to remove element");
        for (Account account:accountList) {
           if(account.getAccountNumber()==1){
               //ConcurrentModificationException
               accountList.remove(account);
           }
        }
        // remove the account whose id is 11
        boolean b = accountList.removeIf(account -> account.getAccountNumber() == 11);
        System.out.println("is removed "+b);

        ///print line by line
        for (Account account:accountList) {
            System.out.println(account);
        }

    }
}
