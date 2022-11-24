package array;

public class Demo15Multi {
    public static void main(String[] args) {
        int[][] array = {
                {},
                {},
                {}
        };
        System.out.println(array);//hashcode
        System.out.println(array.length);//3
        System.out.println(array[0]);//hashcode
        System.out.println(array[1]);//hashcode
        System.out.println(array[2]);//hashcode
        //System.out.println(array[0][0]);//ArrayIndexOutOfBoundsException

        int[][] array2 = {
                {10},
                {20,30},
                {40,50,60}
        };
        //array2 is also called as jagged array.
        // An array which contains different size arrays as its elements

        System.out.println(array2.length);//3
        System.out.println(array2[0].length);//1
        System.out.println(array2[1].length);//2
        System.out.println(array2[2].length);//3

        //printing multidimensional arrays
        System.out.println("********Printing multi-dimensional array ********");
        for (int index = 0; index < array2.length; index++) {
            for (int j = 0; j < array2[index].length; j++) {
                System.out.print (array2[index][j]+" ");
            }
            System.out.println();
        }
    }
}










