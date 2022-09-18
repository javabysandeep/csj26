package controlStatements.conditional;

public class SwitchDemo {
    public static void main(String[] args) {
        //switch
        //value :
            // byte, short, int, char,
            // Byte, Short, Integer, Character, String, enum
        //not allowed : long, float, double, boolean
        int value = 11;
        String str = "hell111o";
        switch (str){
            case "hello" : System.out.println("jan");break;
            case "2" : System.out.println("feb");break;
            case "3" : System.out.println("mar");break;
            case "4" : System.out.println("apr");break;
            case "5" : System.out.println("may");break;
            default:
                System.out.println("invalid input");
        }
       /* if (false) {

        }

        if (value == 1) {
            System.out.println("jan");
        } else if (value == 2) {
            System.out.println("feb");
        } else if (value == 3) {
            System.out.println("mar");
        } else if (value == 4) {
            System.out.println("april");
        } else{
            System.out.println("Invalid");
        }*/

    }
}
