package controlStatements.looping;

public class TransferDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Outside of the for loop");
        System.out.println(10/0);
    }
}
