package controlStatements;

public class IfElseDemo {
    public static void main(String[] args) {
        if(false){
            if(true){
                System.out.println("if block");
            }
        }
//        System.out.println("independent statements");
        else {
            if(false){
                System.out.println("else block");
            }
        }
        System.out.println("rest of the code");
    }
}
