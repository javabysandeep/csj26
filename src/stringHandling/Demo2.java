package stringHandling;

public class Demo2 {
    public static void main(String[] args) {
        //using new keyword objects will be created in HEAP memory area
        String str = new String("abc");

        //using literal way
        // only String class objects can be created with the literal way
        //literal way String class objects will be stored in SCP & not in HEAP
        String str2 = "abc";
    }
}





















