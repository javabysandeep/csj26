package array;

public class Demo13MaxSecondMax {
    public static void main(String[] args) {
        int[] array = {101, 1, 1980, 9, 390};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <array.length ; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println("Max is "+max);
    }
}
