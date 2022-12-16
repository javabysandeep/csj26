package multithreading.functionalRevision;

import classObjectAssignments.Sum;

public class SumOfAddition {
    int start;
    int end;
    int counter=0;

    SumOfAddition(int start, int end) {
        this.start = start;
        this.end = end;
    }

    void add() {
        for (int i = start; i <=end ; i++) {
            counter++;
            System.out.println(counter);
        }
    }

}
