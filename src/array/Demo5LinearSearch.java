package array;

public class Demo5LinearSearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 7, 8, 9, 10, 12, 17};
        int key = 8;
        boolean isPresent = false;
        for (int index = 0; index < array.length; index++) {
            if (key == array[index]) {
                isPresent = true;
                break;
            }
        }
        System.out.println(isPresent ? "present" : "not present");

    }
}
