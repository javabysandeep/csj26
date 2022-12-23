package multithreading.synchronization;

public class Demo4 {
    public static void main(String[] args) {
        Product product = new Product();
            Thread producer = new Thread(()-> {
              while (true){
                  product.produce();
              }

            },"producer");

            Thread consumer = new Thread(()-> {
                while(true){
                    product.consume();
                }
            },"consumer");

            producer.start();
            consumer.start();
        }
}
