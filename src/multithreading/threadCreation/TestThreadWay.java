package multithreading.threadCreation;

public class TestThreadWay {
    public static void main(String[] args) {
        Task task = new Task();
        //by default name of thread will be - thread-0
        // to change name of thread
        task.setName("task");
        task.start();

        System.out.println("rest of the main");
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
