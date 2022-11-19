package array;

public class Demo5LinearSearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 7, 8, 9, 10, 12, 17};
        int key = 8;
        boolean isPresent = false;
        int index = 0;
        while (index < array.length) {
            if (key == array[index]) {
                isPresent = true;
                break;
            }
            index++;
        }
        System.out.println(isPresent ? "present" : "not present");

    }
}
