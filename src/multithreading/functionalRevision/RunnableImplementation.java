package multithreading.functionalRevision;

public class RunnableImplementation {
    public static void main(String[] args) {
        Runnable runnable = ()-> System.out.println("run method");
        runnable.run();

        Thread thread = new Thread(runnable);
    }
}
