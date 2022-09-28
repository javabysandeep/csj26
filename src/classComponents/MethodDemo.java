package classComponents;

public class MethodDemo {
    public static void main(String[] args) {
        //accessing the static methods: we need class name to access static methods

        // if we are in the same class then we can access the static methods directly
        // but it is always recommended to call method with the class name even it is in the same class
        getSystemDetails();
        MethodDemo.getSystemDetails();

        //accessing the instance method: we need an reference variable to access instance methods
        MethodDemo methodDemo = new MethodDemo();
        methodDemo.instanceMethod();
    }
    void instanceMethod(){
        System.out.println("instance method");
    }
    static void getSystemDetails(){
        System.out.println("system details");
    }
}
