package array;

import java.util.Arrays;

public class Demo11ArrayEquality {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40};
        int[] array2 = {10, 20, 30, 40};
        System.out.println(array1.equals(array2));
        System.out.println("Arrays are equal = " + equalsArray(array1, array1));
        System.out.println(Arrays.equals(array1,array2));

    }

    private static boolean equalsArray(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            return false;
        }
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
