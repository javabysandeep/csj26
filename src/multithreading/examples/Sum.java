package multithreading.examples;

public class Sum {
    int start;
    int end;
   static int counter=0;

    Sum(int start, int end) {
        this.start = start;
        this.end = end;
    }

    void add() {
        for (int i = start; i <=end ; i++) {
            counter++;
            System.out.println(counter+" "+ Thread.currentThread().getName());
        }
    }

}
