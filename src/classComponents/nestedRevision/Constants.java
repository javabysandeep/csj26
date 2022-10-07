package classComponents.nestedRevision;

public class Constants {
    //static nested class: all static as well as non-static
    static class Oracle {
        String password = "Oracle Instance pass";
        void m1() {
            System.out.println("instance method from static nested class");
        }

        static String username = "Oracle_username";
        static void m2() {
            System.out.println("static method from static nested class");
        }
    }

    static int number = 100;
}
