package array;

public class Demo14MinArray {
    public static void main(String[] args) {
        int[] array = {102, 10, 1980, 9, 390};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <array.length ; i++) {
            if(min > array[i]){
                min = array[i];
            }
        }
        System.out.println("Min is "+min);
    }
}
