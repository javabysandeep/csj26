package multithreading;

public class Demo1 {
    public static void main(String[] args) {
        // this is just object and not actual thread creation
        Task task = new Task();
        task.setName("task");

        //to actually create thead
        task.start();

        System.out.println("rest of the main method");
        System.out.println(10/0);
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName());
        }

    }
}
