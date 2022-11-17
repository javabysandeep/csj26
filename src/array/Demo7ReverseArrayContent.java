package array;

public class Demo7ReverseArrayContent {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5,6};





        for (int left=0, right= array.length-1; left < right ;left++,right--){
            int temp = array[left];
            array[left]= array[right];
            array[right]= temp;
        }


        System.out.println("printing reverse array");
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index]+" ");
        }

    }
}
