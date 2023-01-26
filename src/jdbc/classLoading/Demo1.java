package jdbc.classLoading;

public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException {

        // in order to create the object of an class, class has to be loaded into the memory
        // To execute the static block, we can create the object of a class so that class can be loaded
        // Problem: we can not guarantee the constructor availability
        // A a = new A();

        // to load the class into the memory we can use Class.forName();

        Class.forName("jdbc.classLoading.A");
    }
}
