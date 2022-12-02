package stringHandling;

public class Demo10 {
    public static void main(String[] args) {
        String str1 = "    welcome to string handling chapter       ";
        str1 = str1.trim().toUpperCase();
        System.out.println(str1);

        String str = "welcome:to:string:handling:chapter";
        System.out.println(str.trim().replace(':', ' '));


        //splitting the string
        String[] strings = str.split(":");
        for (String temp : strings) {
            System.out.println(temp);
        }

        System.out.println("printing integer array");
        int[] array ={1,2,3,4,5};
        for (int temp:array) {
            System.out.print(temp+" ");
        }

    }

}
