package stringHandling;

public class Demo08charAt {
    public static void main(String[] args) {
        String str1 = "this is the demo for charAt";
       /* for (int i = 0; i <str1.length() ; i++) {
            System.out.println(str1.charAt(i));
        }*/

        char[] charArray = str1.toCharArray();
        for (int index = 0; index < charArray.length; index++) {
            System.out.println(charArray[index]);
        }

        String str2 = new String(charArray);

    }
}
