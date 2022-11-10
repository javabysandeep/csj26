package oops.objectClassDemos;

public class GetClassMethodDemo {
    public static void main(String[] args) {
        GetClassMethodDemo ref = new GetClassMethodDemo();
        Class classRef = ref.getClass();
        System.out.println(classRef.getName());
    }
}

