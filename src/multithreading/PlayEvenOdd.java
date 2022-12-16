package multithreading;

public class PlayEvenOdd {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        evenThread.setName("evenThread");

        OddThread oddThread = new OddThread();
        oddThread.setName("oddThread");

        evenThread.start();
        oddThread.start();
    }
}
