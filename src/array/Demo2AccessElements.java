package array;

public class Demo2AccessElements {
    public static void main(String[] args) {
       int[] array = {10,20,30,40,50};
        System.out.println(array);//hexadecimal hashcode
        System.out.println(array.length);//gets the size of an array
        //accessing the elements with the help of index
       /* System.out.println(array[0]);//first element
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);*/
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }

        System.out.println(array[-1]);


    }
}
