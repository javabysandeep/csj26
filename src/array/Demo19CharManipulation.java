package array;

public class Demo19CharManipulation {
    public static void main(String[] args) {
        char[] chars = {'c','y','b','e','r'};
//        char[] chars = null;
        System.out.println(isEmpty(chars));
        System.out.println(size(chars));
        char[] upperCase = toUpperCase(chars);
        System.out.println("uppercase array");
        for (int i = 0; i < upperCase.length; i++) {
            System.out.print(upperCase[i]+" ");
        }
    }

    private static char[] toUpperCase(char[] chars) {
        if(chars==null || chars.length==0){
            return new char[]{};
        }
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]>='a' || chars[i]<='A'){
                chars[i]-=32;
            }
        }
        return chars;
    }

    private static boolean isEmpty(char[] chars) {
        return chars == null || chars.length == 0;
    }
    private static int size(char[] chars) {
        if (chars == null || chars.length == 0) {
            return 0;
        }
        return chars.length;
    }
}
