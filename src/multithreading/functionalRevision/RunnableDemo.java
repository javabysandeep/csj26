package multithreading.functionalRevision;

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable runnable = ()-> System.out.println("run method impl");

        RunnableDemo.acceptRunnable(runnable);
    }

    private static void acceptRunnable(Runnable runnable) {
        if(runnable!=null){
            runnable.run();
        }
    }
}
