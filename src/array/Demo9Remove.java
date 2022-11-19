package array;

public class Demo9Remove {
    public static void main(String[] args) {
       int[] array = {10,20,30,40};
       int elementToBeDeleted = 10;
       int indexOfElementToBeDeleted = 0;

       //find the index of an element to be deleted
        for (int i = 0; i < array.length ; i++) {
            if(array[i]==elementToBeDeleted){
                indexOfElementToBeDeleted = i;
                break;
            }
        }
        //swapping of elements
        for (int i = 0; i < array.length-1; i++) {
          array[i]= array[i+1];
        }
        array[array.length-1]= Integer.MIN_VALUE;
        //print array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

    }
}
