package array;

public class Demo16Matrix {
    public static void main(String[] args) {
       int[][]  matrix = {
               {1,2,3,1},
               {4,5,6,1,2},
               {7,8},
       };
       //out for loop is for going from one row to another row
        for (int i = 0; i < matrix.length ; i++) {
            //inner for loop to iterate the inner array
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}










