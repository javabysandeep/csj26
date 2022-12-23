package multithreading.synchronization;

public class Product {
  synchronized void produce(){
       try {
           Thread.sleep(5000L);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
       System.out.println("Product is produced "+Thread.currentThread().getName());
       try {
           wait();
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
   }
   synchronized void consume(){
       try {
           Thread.sleep(5000L);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
       System.out.println("Product is consumed "+Thread.currentThread().getName());
       notify();

   }
}
