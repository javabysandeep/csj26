package stringHandling;

public class Demo11StringBuffer {
    public static void main(String[] args) {
        String string = "this is string object";
        //StringBuffer stringBuffer = "this is StringBuffer object";//CTE
        //StringBuilder stringBuilder = "this is StringBuilder object";//CTE
        StringBuffer stringBuffer = new StringBuffer("this is StringBuffer object");
        StringBuilder stringBuilder = new StringBuilder("this is StringBuilder object");

        //how to assign string object to StringBuffer or StringBuilder
        //StringBuffer stringBuffer1 = string;//CTE
        //StringBuilder stringBuilder1 =string;//CTE
        //String str1 = stringBuffer;//CTE
        //String str2 = stringBuilder;//CTE


        StringBuffer stringBuffer1 = new StringBuffer(string);
        StringBuilder stringBuilder1 = new StringBuilder(string);
        String str1 = new String(stringBuffer);
        String str2 = new String(stringBuilder);//CTE
    }
}
