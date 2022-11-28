package stringHandling;

public class Demo03 {
    public static void main(String[] args)  {
        //with this line two objects are created one in heap and one in scp
        String str1 = new String("abc");
        System.out.println("Object created inside the Heap "+System.identityHashCode(str1));

        //get the reference of an object created inside the SCP
        String intern = str1.intern();
        System.out.println("Object created inside the SCP "+System.identityHashCode(intern));


        String str2 = "abc";
        System.out.println("Object created inside the SCP again "+System.identityHashCode(str2));
        String str3 = "abc";
        String str4 = "abc";
        String str5 = "abc";
        String str6 = new String("abc");

    }
}

