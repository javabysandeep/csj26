package multithreading.threadCreation;

public class RunnableWayToCreateThreadLambda5 {
    public static void main(String[] args) {

        //way1: to implement Runnable        Runnable referenceOfTypeRunnable = new Work();
       /* way 2: Runnable referenceOfTypeRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("working anonymous "+Thread.currentThread().getName());
            }
        };*/

        //way3: using lambda
        Runnable referenceOfTypeRunnable = () -> System.out.println("working lambda" + Thread.currentThread().getName());
        ;
        Thread thread = new Thread(referenceOfTypeRunnable);
        thread.setName("Work");
        thread.start();

    }
}

class Work implements Runnable {
    @Override
    public void run() {
        System.out.println("working " + Thread.currentThread().getName());
    }
}
