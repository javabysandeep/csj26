package multithreading.examples;

public class ThreadExecutionStackDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println(10 / 0);
            m1();
        }
                , "t1");
        Thread t2 = new Thread(() -> m1(), "t2");

        m1();
        t1.start();
        t2.start();
    }

    public static void m1() {
        System.out.println("m1 " + Thread.currentThread().getName());
        m2();
    }

    public static void m2() {
        System.out.println("m2 " + Thread.currentThread().getName());
        m3();
    }

    public static void m3() {
        System.out.println("m3 " + Thread.currentThread().getName());
    }
}
