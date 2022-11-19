package array;

public class Demo10Copy {
    public static void main(String[] args) {
       int[] array = {10,20,30,40};
//       int[] copy = array;//array reference copy
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i]= array[i];
        }
        //print new array created
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i]+" ");
        }


    }
}
