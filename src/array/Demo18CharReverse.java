package array;

public class Demo18CharReverse {
    public static void main(String[] args) {
        char[] chars = {'c','y','b','e','r'};
        for (int left = 0, right= chars.length-1; left <right ; left++,right--) {
            char temp = chars[left];
            chars[left]= chars[right];
            chars[right]=temp;
        }
        for (int i = 0; i < chars.length ; i++) {
            System.out.print(chars[i]+" ");
        }
    }
}
