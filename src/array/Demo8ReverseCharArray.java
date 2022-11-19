package array;

public class Demo8ReverseCharArray {
    public static void main(String[] args) {
        String name = "welcome to cyber success";
        char[] array = name.toCharArray();
       // char[] array = {'c', 'y', 'b', 'e', 'r'};

        for (int left = 0, right = array.length - 1; left < right; left++, right--) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }

        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }

    }
}
