package multithreading;

public class LambdaDemo {
    public static void main(String[] args) {
        //pre-defined functional interfaces
        // Predicate
        //Supplier
        //Consumer
        //Function
        //BiConsumer
        //BiPredicate
        //BiSupplier
        //Comparator
        //Runnable


        Runnable runnableAnon = new Runnable() {
            @Override
            public void run() {
                System.out.println("anon is running");
            }
        };

        Runnable  runnable = ()->{
            System.out.println("lambda is running");
        };

        runnableAnon.run();
        runnable.run();


    }
}
