package stringHandling;

public class Demo05 {
    public static void main(String[] args) {
        String message = "you are learning string handling";
        message= message.toUpperCase();
        System.out.println(message);

        String source = "cyber success";
//        source = source.replace('c','C');
        source = source.replace("cyber","student");
        System.out.println(source);

        String spaces = "          spaces                      ";
        spaces= spaces.trim();
        System.out.println(spaces.length());

    }
}
