package classComponents.nestedClasses;

public class Database {
    static class LocalDatabase {
        static String USERNAME = "LOCAL_USER";
        static String PASSWORD = "LOCAL_PASS";
    }

    static class DevDatabase {
        static String USERNAME = "DEV_USER";
        static String PASSWORD = "DEV_PASS";
    }

    static class ProdDatabase {
        static String USERNAME = "PROD_USER";
        static String PASSWORD = "PROD_PASS";
    }
}
