package multithreading.threadCreation;

public class Task extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
