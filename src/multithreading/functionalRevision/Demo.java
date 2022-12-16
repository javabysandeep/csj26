package multithreading.functionalRevision;

public class Demo {
    public static void main(String[] args) {
        Runnable runnable = ()-> System.out.println("run");//other two ways
        Thread thread = new Thread(runnable);
        thread.run();
    }
}

class Thread implements Runnable {
    private Runnable target;

    Thread(Runnable target) {
        this.target = target;
    }

    public void run() {
        if (target != null) {
            target.run();
        }
    }
}

