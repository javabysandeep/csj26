package array;

public class Demo4EvenNumbers {
    public static void main(String[] args) {
        int[] array = {1,2,4,5,7,8,9,10,12,17};
        for (int index = 0; index < array.length; index++) {
            if(array[index]%2==0){
                System.out.println(array[index]);
            }
        }

    }
}
