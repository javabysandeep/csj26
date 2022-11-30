package stringHandling;

public class Demo04 {
    public static void main(String[] args) {
        String str = "abc";
        //at this line toString(): because toString() is overriden inside the String
        System.out.println(str.toString());

        String greeting = "good morning";
        System.out.println("Length of string "+greeting.length());
        char[] array ={};
        System.out.println(array.length);


        String str1 ="hello";
        System.out.println(str1);

        str1 ="hello again ";
        System.out.println(str1);

        String name = "abc";
        name = name+ " xyz";
        name = name.concat(" hello");
        System.out.println(name
        );
    }
}

