package multithreading;

public class Task extends Thread{
    @Override
    public void run() {
        System.out.println("run method");
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
